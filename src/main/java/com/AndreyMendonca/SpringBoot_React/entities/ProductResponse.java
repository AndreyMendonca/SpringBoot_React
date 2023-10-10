package com.AndreyMendonca.SpringBoot_React.entities;

import org.springframework.stereotype.Component;

@Component
public class ProductResponse {
	private String messagem;

	public String getMessagem() {
		return messagem;
	}

	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}
	
	
}
