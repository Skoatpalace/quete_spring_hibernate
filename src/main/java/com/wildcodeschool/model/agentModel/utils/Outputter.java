package com.wildcodeschool.model.agentModel.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.model.agentModel.entities.AgentModel;
import com.wildcodeschool.model.agentModel.repositories.AgentDao;


@Component
public class Outputter implements CommandLineRunner {
	
	private Logger LOG = LoggerFactory.getLogger("Wilder");

	@Autowired
	private AgentDao agentDao;

	@Override
	public void run(String... args) throws Exception {
		LOG.info("******************");
        LOG.info("Objects in DB : " + agentDao.count());

        AgentModel agent1 = new AgentModel("Noël", "Joyeux", "0123456789", "joyeux.noel@petitpapa.nl");
        LOG.info("******************");
        LOG.info(agent1 + " has been created !");
        agentDao.save(agent1);
        LOG.info(agent1 + " has been saved !");

        
        LOG.info("******************");
        LOG.info("Users in list are ");
        for(AgentModel myAgent : agentDao.findAll()) {
            LOG.info(myAgent.toString());
        };

	}

}
