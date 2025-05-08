import com.aluracursos.screenmatch.calculos.CalculadoraTiempo;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class Principal {

    public static void main(String[] args) {
        Titulo miTitulo = new Titulo();
//new pelicula: crea un espacio para es objeto almacenar los nuevos datos
//de com.aluracursos.screenmatch.modelos.Titulo con sus diferentes atributos.
//Creamos un objeto y le hemos atribuido valores a ese objeto.
        miTitulo.setName("Amelie");
        miTitulo.setDirector("Jean Pierre Jeunet");
        miTitulo.setFechaDeLanzamiento(2001);
        miTitulo.setDuracionMinutos(120);
        miTitulo.setIncluidoPlan(true);

        miTitulo.muestraFichaTecnica();
        miTitulo.evalua(10);
        miTitulo.evalua(8.0);
        miTitulo.evalua(7.8);
        System.out.println(miTitulo.getTotalEvaluaciones());
        System.out.println(miTitulo.calculaMedia());

//Para imprimir datos en pantalla, estos datos se pasaron
// a la clase com.aluracursos.screenmatch.modelos.Titulo para generar la ficha técnica.
//        System.out.println("Me encanta esta película: " + miTitulo.name);
//        System.out.println("Director: " + miTitulo.director);
//        System.out.println("Fecha lanzamiento " + miTitulo.fechaDeLanzamiento);
//        System.out.println("Duración: " + miTitulo.duracionMinutos + " minutos");

//Aquí creamos otro objeto diferente con el nombre de otroTitulo
//Aquí crea otro espacio en memorio para almacenar este otro objeto
        Titulo otroTitulo = new Titulo();
        otroTitulo.setName("Forrest Gump");
        otroTitulo.setDirector("Robert Zemeckis");
        otroTitulo.setFechaDeLanzamiento(1994);
        otroTitulo.setDuracionMinutos(130);
        otroTitulo.setIncluidoPlan(true);

//Para imprimir datos en pantalla
//la ficha técnica se esta declarando desde la clase título, aquí se debe declarar con la información de objeto.
        otroTitulo.muestraFichaTecnica();
        otroTitulo.evalua(9.0);
        otroTitulo.evalua(7.0);
        otroTitulo.evalua(9.8);
        System.out.println(otroTitulo.getTotalEvaluaciones());
        System.out.println(otroTitulo.calculaMedia());


        Serie supernatural = new Serie();
        supernatural.setName("Supernatural");
        supernatural.setDirector("Eric Kripke");
        supernatural.setFechaDeLanzamiento(2005);
        supernatural.setTemporadas(15);
        supernatural.setMinutosEpisodios(40);
        supernatural.setEpisodiosTemporadas(327);
        supernatural.setIncluidoPlan(true);
        supernatural.muestraFichaTecnica();
        supernatural.evalua(6.0);
        supernatural.evalua(8.0);
        supernatural.evalua(7.0);
        //override del metodo
        System.out.println(supernatural.getDuracionMinutos());
        System.out.println(supernatural.getTotalEvaluaciones());
        System.out.println(supernatural.calculaMedia());

        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(miTitulo);
        calculadora.incluye(otroTitulo);
        calculadora.incluye(supernatural);

        System.out.println(calculadora.getTiempoTotal());
    }

}
