package src;

import src.proj3.aparelhoTelefonico;
import src.proj3.navegadorInternet;
import src.proj3.reprodutorMusical;

public class Main {
    public static void main(String[] args) {
        reprodutorMusical spotify = new reprodutorMusical();

        spotify.tocar();
        spotify.pausar();
        spotify.selecionarMusica("NOVEMBER RAIN");


        aparelhoTelefonico celular = new aparelhoTelefonico();

        celular.ligar("11998765421");
        celular.atender();
        celular.iniciarCorreioVoz();

        navegadorInternet chrome = new navegadorInternet();

        chrome.exibirPagina("www.google.com.br");
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
    }
}
