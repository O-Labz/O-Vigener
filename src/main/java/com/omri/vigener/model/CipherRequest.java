package com.omri.vigener.model;

public class CipherRequest {
	
	private String key;
	
	private String rawtext;
	
	private Boolean encrypt;
	

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the rawtext
	 */
	public String getRawtext() {
		return rawtext;
	}

	/**
	 * @param rawtext the rawtext to set
	 */
	public void setRawtext(String rawtext) {
		this.rawtext = rawtext;
	}

	/**
	 * @return the encrypt
	 */
	public Boolean getEncrypt() {
		return encrypt;
	}

	/**
	 * @param encrypt the encrypt to set
	 */
	public void setEncrypt(Boolean encrypt) {
		this.encrypt = encrypt;
	}

}
