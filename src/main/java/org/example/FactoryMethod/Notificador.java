package org.example.FactoryMethod;

public abstract class Notificador {
    abstract Notificacao criarNotificacao();

    public void realizarEnvio() {
        Notificacao n = criarNotificacao();
        n.enviar();
    }
}
