package org.example.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Notificador meuNotificador = new FactoryNotificacaoEmail();
        meuNotificador.realizarEnvio();
    }
}
