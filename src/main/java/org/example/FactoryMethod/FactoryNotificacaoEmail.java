package org.example.FactoryMethod;

public class FactoryNotificacaoEmail extends Notificador{
    public Notificacao criarNotificacao() {
        System.out.println("Email");
        return new EmailNotificacao();
    }
}
