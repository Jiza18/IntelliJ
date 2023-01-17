import java.util.*;


class Battleship {
    //MEJOR ORGANIZADO

    public int menu(){
        

        Scanner entrada = new Scanner(System.in);

        System.out.println("Niveles de dificultad.");
        System.out.println();

        System.out.println("1.Facil");
        System.out.println("2.Medio");
        System.out.println("3.Dificil");
        System.out.println("4.Personalizado");
        System.out.println("5.Salir");

        return entrada.nextInt();
    }

    public char[][] tableroIA(){

        char[][] tableroIA = new char[10][10];

        for(int i = 0; i < tableroIA.length; i++){
            for(int a = 0; a < tableroIA[0].length; a++){
                tableroIA[i][a] = '-';
            }
        }
        return tableroIA;
    }

    public void mostrar(char[][] tablero){

        char indicechar = 'A';

        System.out.print("  ");

        for(int i = 0; i < 10; i++) {

            System.out.print(i + " ");
        }
        System.out.println();

        for (int i=0; i<10; i++)
        {
            System.out.print(indicechar + " ");
            indicechar++;
            for (int j=0; j<10; j++)
            {
                System.out.print(tablero[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }

    public int fila(){
        return (int) (Math.random() * 10);
    }

    public int columna(){
        return (int) (Math.random() * 10);
    }

    public boolean compruebalancha(char[][] tablero,int fila, int columna){

        boolean comprueba = true;

        if(tablero[fila][columna] == '-'){

            comprueba = false;

        }
        return comprueba;
    }

    public void lancha(char[][] tablero){
        int fila = 0;
        int columna = 0;
        int cont = 0;
        boolean comprueba = true;

        do{
            fila = fila();
            columna = columna();

            comprueba = compruebalancha(tablero,fila,columna);

            if(comprueba){

                tablero[fila][columna] = 'L';

                cont++;

            }

        }
        while(cont < 5);

    }

    void main(){
        char[][] tablero = tableroIA();

        lancha(tablero);
        mostrar(tablero);
    }
}
public class Main {
    public static void main(String[] args) {
        new Battleship().main();
    }
}