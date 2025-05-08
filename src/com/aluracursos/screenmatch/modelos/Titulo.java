package com.aluracursos.screenmatch.modelos;

public class Titulo {
//creo clase modelo
//estructura que permite crear diferentes objetos o películas a futuro
    private String name;
    private String director;
    private int fechaDeLanzamiento;
    private int duracionMinutos;
    private boolean incluidoPlan;
    private double sumaValoraciones;
    private int totalEvaluaciones;

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncluidoPlan() {
        return incluidoPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoPlan(boolean incluidoPlan) {
        this.incluidoPlan = incluidoPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

//Aquí instancio las variables creando la clase principal,
//donde creo una clase com.aluracursos.screenmatch.modelos.Titulo y almacenare los datos de el objeto titulo
//en la clase principal se encuentran los datos instanciados.

//Aquí creo un nuevo método (void) donde se coloca la información
//que necesitamos en este caso la ficha técnica.
//(Void) es un método que no retorna nada, solo ejecutarlos.

    public void muestraFichaTecnica(){
//Aquí queremos que nos imprima lo que esta desde la línea 15 a la 18 de la clase principal, que nos muestre
// en consola la información de los datos de nuestra película.
       // System.out.println("Nombre película: " + miTitulo.name);
//Al pasarlo acá debemos ajustar para que sea general el llamado de los titulos de las películas, se modifica miTitulo.name
// por solo name, que hace el llamado general de todos los titulos de peliculas agregados.

        System.out.println("Nombre película: " + name);
        System.out.println("Director: " + director);
        System.out.println("Fecha lanzamiento " + fechaDeLanzamiento);
        System.out.println("Duración: " + getDuracionMinutos() + " minutos");

    }
//Aquí creamos un método para evaluar nuestras películas
    public void evalua(double nota){
        sumaValoraciones += nota;
        totalEvaluaciones ++;
    }
//Aquí nos debe retornar un valor y realizar el cálculo
    public double calculaMedia(){
        return sumaValoraciones / totalEvaluaciones;
    }

}
