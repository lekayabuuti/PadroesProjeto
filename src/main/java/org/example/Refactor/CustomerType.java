package org.example.Refactor;

public enum CustomerType {
    REGULAR(0.05),
    PREMIUM(0.10),
    VIP(0.15);

    private final double fatorMultiplicacao;

    CustomerType(double fatorMultiplicacao) {
        this.fatorMultiplicacao = fatorMultiplicacao;
    }

    public double getFatorMultiplicacao() {
        return fatorMultiplicacao;
    }
}
