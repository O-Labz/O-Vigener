package com.omri.vigener.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omri.vigener.model.CipherRequest;
import com.omri.vigener.model.CipherResponse;
import com.omri.vigener.service.CipherService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cipher")
public class CipherController {

	@Autowired
	private CipherService cipherservice;

	private CipherResponse response;

	@PostMapping(value = "/encrypt", consumes = "application/json", produces = "application/json")
	public CipherResponse encrypt (@RequestBody CipherRequest cipherRequest) {
		
		response = new CipherResponse ();

		try {
			//  Block of code to try
			if(cipherRequest.getEncrypt()) {
				response = cipherservice.encryptText(cipherRequest);
			}else{
				response = cipherservice.decryptText(cipherRequest);
			}
		}
		catch(Exception e) {
			//  Block of code to handle errors
			e.getMessage();
		}

		return response;
	}

	@PostMapping("/decrypt")
	public CipherResponse decrypt (@RequestBody CipherRequest cipherRequest) {

		response = new CipherResponse ();

		try {
			//  Block of code to try
			response = cipherservice.decryptText(cipherRequest);
		}
		catch(Exception e) {
			//  Block of code to handle errors
			e.getMessage();
		}

		return response;

	}

}
