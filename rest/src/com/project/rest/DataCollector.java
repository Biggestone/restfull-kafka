package com.project.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.project.kafkaProject.KafkaProducerTest;






@Path("/service")
public class DataCollector {
	@POST
	@Path("/enviarDados")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String dataCollect(RequestBody request) {
		
		KafkaProducerTest.runProducer(request.getFrase());
		return request.getFrase() ;
		
		
		
		
	}
}
