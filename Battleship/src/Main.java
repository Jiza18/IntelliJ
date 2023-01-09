import java.util.*;
public class Main {
    //Jose Miguel Izarra

    //Proyecto Battleship

    public static char[][]
    tableroIA() {

        char indicechar = 'A';

        char[][] tablero = new char[10][10];
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                tablero[i][j] = '_';
            }

        }

        char p = 'P';
        char z = 'Z';


        return tablero;
    }

    public static int fila(){

        int fila = (int) (Math.random() * 10);
        return fila;

    }

    public static int columna(){

        int columna = (int) (Math.random() * 10);
        return columna;

    }

    public static void lancha(char t[][]){

        int lanchas = 5;
        char l = 'L';

        for(int i = 0; i < lanchas; i++){

            int fila = fila();
            int columna = columna();

            t[fila][columna] = l;

        }

    }

    public static void barco(char[][] t) {

        int fila = 0;
        int columna = 0;


        boolean comprueba = compruebabarco(t,fila,columna);

        if(comprueba == true){
            for(int i = 0; i < 3; i++){
                t[fila+i][columna+i] = 'B';
            }
        }

    }

    public static boolean compruebalancha(char ta[][], int a, int b){

        boolean comprueba = false;


        if(ta[a][b] == '-') {
            comprueba = true;
        }

        return comprueba;
    }

    public static boolean compruebabarco(char ta[][], int a, int b){

        boolean comprueba = false;

        int fila;
        int columna;

        do{
            fila = fila();
            columna = columna();

            if(ta[fila][columna] == '-'){
                if(ta[fila][columna] < ta.length){
                    comprueba = true;
                    System.out.println("True");
                }
            }
            else{
               System.out.println("False");
            }

        }

        while(comprueba == false);

        return comprueba;
    }


    public static void disparo(char t[][], int intentos) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;

        do {


            System.out.println("Introduce la fila");

            int fila = entrada.nextInt();

            System.out.println("Introduce la columna");

            int columna = entrada.nextInt();

            t[fila][columna] = '*';

            mostrar(t);
        }
        while(contador != intentos);

    }

    public static int menu() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Niveles de dificultad");
        System.out.println();

        System.out.println("1.Facil");
        System.out.println("2.Medio");
        System.out.println("3.Dificil");
        System.out.println("4.Personalizado");

        int opcion = entrada.nextInt();

        return opcion;

    }

    public static void mostrar(char tablero[][]) {

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

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char taule[][] = tableroIA();

        lancha(taule);

        int intentos = 10;

        mostrar(taule);

        barco(taule);

        mostrar(taule);



    }
}