package com.ddc.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ddc.cms.service.AppUserService;

/**
 * 用户控制层
 *
 */
@RestController
public class UserRestController {

	@Autowired
	private AppUserService appUserService;

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public Integer findByName(@RequestParam(value = "username") String username) {
		System.out.println("====service2 controller 3333 ========== ");
		return appUserService.findUser(username);
		
	}

}
