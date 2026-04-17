package com.example.NodeRegistrationAPI.Service;

import com.example.NodeRegistrationAPI.Model.NodeEntity;
import com.example.NodeRegistrationAPI.Repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NodeService {
    @Autowired
    private NodeRepository nodeRepository;

    public NodeEntity registerNode(NodeEntity nodeEntity){
        nodeEntity.setCreatedAt(LocalDateTime.now());
        return nodeRepository.save(nodeEntity);
    }
}
