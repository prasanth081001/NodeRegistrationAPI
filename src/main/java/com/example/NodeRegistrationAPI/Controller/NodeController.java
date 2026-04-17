package com.example.NodeRegistrationAPI.Controller;

import com.example.NodeRegistrationAPI.Model.NodeEntity;
import com.example.NodeRegistrationAPI.Service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {
    @Autowired
    private NodeService nodeService;

    @PostMapping("/register")
    public String registerNode(@RequestBody NodeEntity nodeEntity){
        nodeService.registerNode(nodeEntity);
        return "Success";
    }
}
