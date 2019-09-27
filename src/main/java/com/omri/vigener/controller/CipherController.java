package com.omri.vigener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omri.vigener.model.CipherResponse;

@RestController
@RequestMapping("/api/cipher")
public class CipherController {
	
	@GetMapping("/encrypt")
	public CipherResponse encrypt () {
		
		CipherResponse resp = new CipherResponse ();
		
		resp.setSuccess(true);
		resp.setText("Omri String Encrypted");
		
		return resp;
		
	}
	
	@GetMapping("/decrypt")
	public CipherResponse decrypt () {
		
		CipherResponse resp = new CipherResponse ();
		
		resp.setSuccess(true);
		resp.setText("Omri String Decrypted");
		
		return resp;
		
	}

}
