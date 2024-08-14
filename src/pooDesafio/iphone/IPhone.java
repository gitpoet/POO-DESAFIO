package pooDesafio.iphone;

import pooDesafio.aparelhoTelefonico.AparelhoTelefonico;
import pooDesafio.navegadorInternet.NavegadorInternet;
import pooDesafio.reprodutorMusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando a sua música preferida");
		
	}

	@Override
	public void pausar() {
		
		System.out.println("Pausando a música");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionado a sua música preferida");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando o seu iPhone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando um correio de voz");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página");
		
	}

	@Override
	public void exibirPagina(String yrl) {
		// TODO Auto-generated method stub
		
	}
	
	

}
