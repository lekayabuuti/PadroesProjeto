package org.example.Facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();

        facade.assistirFilme();
        facade.finalizarFilme();
    }
}
