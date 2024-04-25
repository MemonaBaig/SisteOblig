package com.example.sisteoblig;

public class Billett {

    private String film;
    private String antall;
    private String fornavn;
    private String etternavn;
    private int telefonnr;

    private String epost;

    public Billett() {
    }

    //Statisk metode for variablene

    private String Billetter(String film, String antall, String fornavn, String etternavn, int telefonnr, String epost) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;

        return film;
    }

    //Getters og Setters for Variablene
    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    @Override
    public String toString() {
        return "Billett{" +
                "film='" + film + '\'' +
                ", antall='" + antall + '\'' +
                ", fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", telefonnr=" + telefonnr +
                ", epost='" + epost + '\'' +
                '}';
    }

    public Object getKino() {
        return null;
    }
}

