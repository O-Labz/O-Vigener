package com.omri.vigener.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.omri.vigener.model.CipherRequest;
import com.omri.vigener.model.CipherResponse;

@Service
public class CipherService {

	public CipherResponse encryptText(@RequestBody CipherRequest cipherRequest) {

		CipherResponse response = new CipherResponse ();
		
        String result = "";
        String plainText = "";
        
        plainText = cipherRequest.getRawtext().toLowerCase();
        for (int i = 0, j = 0; i < plainText.length(); i++)
        {
            char c = plainText.charAt(i);
            if (c < 'a' || c > 'z')
                continue;
            result += (char) ((c + cipherRequest.getKey().charAt(j) - 2 * 'a') % 26 + 'a');
            j = ++j % cipherRequest.getKey().length();
        }

		response.setSuccess(cipherRequest.getEncrypt());
		response.setText(result);

		return response;

	}
	
	public CipherResponse decryptText(@RequestBody CipherRequest cipherRequest) {

		CipherResponse response = new CipherResponse ();
		
        String result = "";
        String encryptedText = "";
        
        encryptedText = cipherRequest.getRawtext().toLowerCase();
        for (int i = 0, j = 0; i < encryptedText.length(); i++)
        {
            char c = encryptedText.charAt(i);
            if (c < 'a' || c > 'z')
                continue;
            result += (char) ((c - cipherRequest.getKey().charAt(j) + 26) % 26 + 'a');
            j = ++j % cipherRequest.getKey().length();
        }

		response.setSuccess(cipherRequest.getEncrypt());
		response.setText(result);

		return response;

	}

}
