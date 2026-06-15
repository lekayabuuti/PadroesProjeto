package org.example.FactoryMethod;

public class FactoryNotificacaoSMS extends Notificador{
    public Notificacao criarNotificacao() {
        System.out.println("SMS");
        return new SMSNotificacao();
    }
}
