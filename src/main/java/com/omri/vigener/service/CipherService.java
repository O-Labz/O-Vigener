package com.omri.vigener.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.omri.vigener.model.CipherRequest;
import com.omri.vigener.model.CipherResponse;

@Service
public class CipherService {

	public CipherResponse encryptText(@RequestBody CipherRequest cipherRequest) {

		CipherResponse response = new CipherResponse ();

		response.setSuccess(cipherRequest.getEncrypt());
		response.setText(cipherRequest.getRawtext());

		return response;

	}
	
	public CipherResponse decryptText(@RequestBody CipherRequest cipherRequest) {

		CipherResponse response = new CipherResponse ();

		response.setSuccess(cipherRequest.getEncrypt());
		response.setText(cipherRequest.getRawtext());

		return response;

	}

}
