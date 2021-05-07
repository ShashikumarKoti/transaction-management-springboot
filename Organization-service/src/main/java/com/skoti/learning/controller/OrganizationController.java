package com.skoti.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skoti.learning.dto.OrgRequest;
import com.skoti.learning.service.OrganizationService;

@RestController
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;
	
	@PostMapping("/saveOrg")
	public void joinOrg(@RequestBody OrgRequest orgRequest) {
		organizationService.joinOrganization(orgRequest);
	}
	
}
