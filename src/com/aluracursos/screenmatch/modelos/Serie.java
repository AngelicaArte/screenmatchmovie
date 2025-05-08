package com.aluracursos.screenmatch.modelos;
//Aquí se coloca la palabra extends para heredar los atributos de Titulo

public class Serie extends Titulo {
    int temporadas;
    int episodiosTemporadas;
    int minutosEpisodios;

//se define private o public que controlan la visibilidad de clases, métodos y atributos.
// se aplica el método de getter y setter para controlar el acceso a los atributos de una clase.
//override sobreescribir un método de otra clase
    @Override
    public int getDuracionMinutos() {
        return temporadas * episodiosTemporadas * minutosEpisodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosTemporadas() {
        return episodiosTemporadas;
    }

    public void setEpisodiosTemporadas(int episodiosTemporadas) {
        this.episodiosTemporadas = episodiosTemporadas;
    }

    public int getMinutosEpisodios() {
        return minutosEpisodios;
    }

    public void setMinutosEpisodios(int minutosEpisodios) {
        this.minutosEpisodios = minutosEpisodios;
    }
}
