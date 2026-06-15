package org.example.FactoryMethod;

public class SMSNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("enviando sms");
    }

}
