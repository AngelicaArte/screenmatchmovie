package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraTiempo {
    private int tiempoTotal;


    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracionMinutos();
    }

    public void incluye(Serie serie){
        tiempoTotal += serie.getDuracionMinutos();
    }


}
