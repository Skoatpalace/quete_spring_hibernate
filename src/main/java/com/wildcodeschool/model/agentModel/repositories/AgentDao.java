package com.wildcodeschool.model.agentModel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.model.agentModel.entities.AgentModel;

@Repository
public interface AgentDao extends JpaRepository<AgentModel, Long> {

}
