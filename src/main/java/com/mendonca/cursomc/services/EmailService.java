package com.mendonca.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.mendonca.cursomc.domain.Cliente;
import com.mendonca.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
