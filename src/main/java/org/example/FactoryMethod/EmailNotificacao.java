package org.example.FactoryMethod;

public class EmailNotificacao implements Notificacao{
    @Override
    public void enviar() {
        System.out.println("enviando email");
    }
}
