package org.example.Builder;

public class Sanduiche {
    private String pao;
    private String carne;
    private String queijo;
    private String salada;
    private String molho;

    public Sanduiche(BuilderSanduiche builderSanduiche) {
        this.pao = builderSanduiche.pao;
        this.carne = builderSanduiche.carne;
        this.queijo = builderSanduiche.queijo;
        this.salada = builderSanduiche.salada;
        this.molho = builderSanduiche.molho;
    }

    public String getPao() {
        return pao;
    }

    public String getCarne() {
        return carne;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getSalada() {
        return salada;
    }

    public String getMolho() {
        return molho;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public static class BuilderSanduiche {
        private String pao;
        private String carne;
        private String queijo;
        private String salada;
        private String molho;

        public BuilderSanduiche setPao(String pao) {
            this.pao = pao;
            return this;
        }

        public BuilderSanduiche setCarne(String carne) {
            this.carne = carne;
            return this;
        }

        public BuilderSanduiche setQueijo(String queijo) {
            this.queijo = queijo;
            return this;
        }

        public BuilderSanduiche setSalada(String salada) {
            this.salada = salada;
            return this;
        }

        public BuilderSanduiche setMolho(String molho) {
            this.molho = molho;
            return this;
        }


    }
}
