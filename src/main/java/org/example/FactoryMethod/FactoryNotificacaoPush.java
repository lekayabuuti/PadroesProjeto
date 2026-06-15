package org.example.FactoryMethod;

public class FactoryNotificacaoPush extends Notificador{
    public Notificacao criarNotificacao() {
        System.out.println("Push");
        return new PushNotificacao();
    }
}
