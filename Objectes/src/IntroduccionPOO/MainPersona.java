package IntroduccionPOO;

public class MainPersona {

    public static void main(String[] args) {

        Persona persona1;
        Persona persona2;
        Persona martin;

        persona1 = new Persona();
        persona2 = new Persona();

        persona1.nombre = "Nestor";
        persona1.apellido = "Cantarero";
        persona1.edad = 19;
        persona1.altura = 1.85;
        persona1.peso = 40.6;
        persona1.genero = 'F';

        persona2.nombre = "Jaume";
        persona2.apellido = "Valls";
        persona2.edad = 46;
        persona2.altura = 1.50;
        persona2.peso = 54;
        persona2.genero = 'M';

        persona1.listar();
        persona2.listar();


    }

}
