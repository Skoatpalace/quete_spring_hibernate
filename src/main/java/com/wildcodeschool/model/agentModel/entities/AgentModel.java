package com.wildcodeschool.model.agentModel.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AgentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    private String nomAgent;
    
    private String prenomAgent;
    
    private String telAgent;
    
    private String mailAgent;
    
    @Override
	public String toString() {
		return "AgentModel [id=" + id + ", nomAgent=" + nomAgent + ", prenomAgent=" + prenomAgent + ", telAgent="
				+ telAgent + ", mailAgent=" + mailAgent + "]";
	}
    


    public AgentModel(String nomAgent, String prenomAgent, String telAgent, String mailAgent) {
        
        this.nomAgent = nomAgent;
        this.prenomAgent = prenomAgent;
        this.telAgent = telAgent;
        this.mailAgent = mailAgent;

    }

    public AgentModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomAgent() {
        return nomAgent;
    }

    public void setNomAgent(String nomAgent) {
        this.nomAgent = nomAgent;
    }

    public String getPrenomAgent() {
        return prenomAgent;
    }

    public void setPrenomAgent(String prenomAgent) {
        this.prenomAgent = prenomAgent;
    }

    public String getTelAgent() {
        return telAgent;
    }

    public void setTelAgent(String telAgent) {
        this.telAgent = telAgent;
    }

    public String getMailAgent() {
        return mailAgent;
    }

    public void setMailAgent(String mailAgent) {
        this.mailAgent = mailAgent;
    }

}
