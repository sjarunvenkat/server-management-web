package com.example.mongoserver.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.mongoserver.ServerNotFoundException;
import com.example.mongoserver.model.Server;
import com.example.mongoserver.repositories.ServerRepository;

@Controller
@RequestMapping("/servers")
public class ServerController {

    @Autowired
    public ServerRepository serverRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<Server> servers = serverRepository.findAll();
        model.addAttribute("servers", servers);
        return "index";
    }

    @PostMapping(value = "/create")
    public String createServer(
        @RequestParam String id,
        @RequestParam String name,
        @RequestParam String language,
        @RequestParam String framework) {

        // Create a Server object and save it to the database
        Server server = new Server(name, id, language, framework); // Make sure the order is correct here
        serverRepository.insert(server);

        // Redirect back to the index page
        return "redirect:/servers/";
    }

    @GetMapping("/{id}/edit")
    public String editServerPage(@PathVariable String id, Model model) {
        Server server = serverRepository.findById(id)
                .orElseThrow(() -> new ServerNotFoundException("Server not found with id: " + id));

        // Pass the server object to the edit page
        model.addAttribute("server", server);

        return "edit"; // Assuming you have an "edit.html" Thymeleaf template for editing
    }

    // Add a method to handle the form submission for editing
    @PostMapping("/edit")
    public String editServer(@ModelAttribute Server updatedServer) {
        // Update the server details in the database
        serverRepository.save(updatedServer);

        // Redirect back to the list of servers after editing
        return "redirect:/servers/";
    }

    @GetMapping("/{id}")
    public String viewServer(@PathVariable String id, Model model) {
        Server server = serverRepository.findById(id)
                .orElseThrow(() -> new ServerNotFoundException("Server not found with id: " + id));
        
        // Pass the server object to the view page
        model.addAttribute("server", server);
        
        return "view"; // Assuming you have a "view.html" Thymeleaf template for viewing
    }

    @GetMapping("/{id}/delete")
    public String deleteServer(@PathVariable String id) {
        Server server = serverRepository.findById(id)
                .orElseThrow(() -> new ServerNotFoundException("Server not found with id: " + id));
        
        // Delete the server from the database
        serverRepository.delete(server);
        
        return "redirect:/servers/"; // Redirect back to the list of servers
    }   
    
}
