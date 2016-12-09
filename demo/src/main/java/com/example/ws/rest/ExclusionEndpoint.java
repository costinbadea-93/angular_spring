package com.example.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Exclusion;
import com.example.service.ExclusionService;

@RestController
@RequestMapping("/rest/exclusion")
public class ExclusionEndpoint {

	@Autowired
	private ExclusionService exclusionService;
	
	@RequestMapping
	public void createExclusion(Exclusion exclusion) {
		exclusionService.createExclusion(exclusion);
	}
}
