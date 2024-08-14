package pooDesafio;

import pooDesafio.aparelhoTelefonico.AparelhoTelefonico;
import pooDesafio.iphone.IPhone;

public class main {
	
public static void main(String[] args) {
	
	IPhone telefone = new IPhone();
	
	telefone.ligar("carlos");
	telefone.atender(); 
	telefone.iniciarCorreioVoz();
	
	telefone.adicionarNovaAba();
	telefone.atualizarPagina();
	telefone.exibirPagina("www.tutut.com.br");
	
	telefone.tocar();
	telefone.pausar();
	telefone.selecionarMusica("Travessia");

		
	
}
}


