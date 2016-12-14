package com.example.ws.rest;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Exclusion;
import com.example.repository.ExclusionRepository;
import com.example.service.ExclusionService;


@RestController
@RequestMapping("/rest/exclusion")
public class ExclusionEndpoint {

	@Autowired
	private ExclusionRepository exclusionRepository;
	
	@Autowired
	private ExclusionService exclusionService;
	
	//post exclusion
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> createExclusion(@RequestBody Exclusion exclusion) {
		Exclusion excl = exclusionService.createExclusion(exclusion);
		
		URI location = URI.create("/rest/exclusion/" + excl.getId());
		return ResponseEntity.created(location).body(excl.getId());
	}
	
	//get exclusion
	@RequestMapping(value = "{exclusionId}", method = RequestMethod.GET)
	public Exclusion retrieveExclusion(@PathVariable Long exclusionId){
		return exclusionRepository.findOne(exclusionId);
	}
	
	//delete exclusion
	@RequestMapping(value = "{exclusionId}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteExclusion(@PathVariable Long exclusionId){
		Exclusion deletedExclusion =  exclusionRepository.findOne(exclusionId);	
		exclusionRepository.delete(deletedExclusion);
		
		return ResponseEntity.noContent().build();
	}
	//get all exclusions
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Object retrieveAllExclusion(){
	//	List<Exclusion> exclusions = exclusionRepository.findAll();
		return exclusionService.retrieveAllExclusion();
	}
}
