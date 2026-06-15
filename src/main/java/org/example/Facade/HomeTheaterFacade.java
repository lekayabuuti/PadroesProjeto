package org.example.Facade;

public class HomeTheaterFacade {
    private final Luzes luzes = new Luzes();
    private final Projetor projetor = new Projetor();
    private final SistemaSom sistemaSom = new SistemaSom();
    private final StreamingService streamingService = new StreamingService();

    public void assistirFilme() {
        luzes.apagar();
        projetor.ligar();
        sistemaSom.ligar();
        streamingService.selecionar();
    }

    public void finalizarFilme() {
        luzes.acender();
        streamingService.finalizar();
        sistemaSom.desligar();
        projetor.desligar();
    }
}
