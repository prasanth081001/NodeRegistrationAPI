package com.example.NodeRegistrationAPI.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "nodes")
public class NodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nodeName;
    private String ipAddress;
    private String status;
    private LocalDateTime createdAt;

    public NodeEntity(){
        super();
    }

    public NodeEntity(Long id, String nodeName, String ipAddress, String status, LocalDateTime createdAt) {
        super();
        this.id = id;
        this.nodeName = nodeName;
        this.ipAddress = ipAddress;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
