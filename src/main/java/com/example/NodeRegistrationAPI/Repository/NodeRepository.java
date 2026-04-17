package com.example.NodeRegistrationAPI.Repository;

import com.example.NodeRegistrationAPI.Model.NodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NodeRepository extends JpaRepository<NodeEntity,Long> {
}
