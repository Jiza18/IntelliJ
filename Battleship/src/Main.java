import java.util.*;
public class Main {
    //Jose Miguel Izarra

    //Proyecto Battleship

    public static char[][]
    tableroIA() {


        char[][] tablero = new char[10][10];
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                tablero[i][j] = '-';
            }

        }


        return tablero;
    }

    public static int fila(){

        return (int) (Math.random() * 10);

    }

    public static int columna(){

        return (int) (Math.random() * 10);

    }

    public static void lancha(char[][] t){

        for(int i = 0; i < 5; i++){

            int fila = fila();
            int columna = columna();

            t[fila][columna] = 'L';

        }

    }

    public static void barco(char[][] t) {

        boolean comprueba = false;
        int cont = 0;

        for(int x = 0; x < 3; x++){
            do{
                int fila = fila();
                int columna = columna();

                comprueba = compruebabarco(t,fila,columna);

                if(comprueba){
                    for(int i = 0; i < 3; i++){
                        t[fila][columna+i] = 'B';
                    }
                    cont++;
                }
            }
            while(!comprueba);
        }
    }


    public static boolean compruebabarco(char[][] ta, int a, int b){

        boolean comprueba = false;
        int contador = 0;

        do {
            a = fila();
            b = columna();

            for(int i = 0; i < 3; i++){
                if(ta[a][b+i] < ta.length){
                    for(int x = 0; a < 3; a++){
                        if(ta[a+x][b] == '-'){
                            contador++;
                        }
                    }
                    if(contador == 3){
                        comprueba = true;
                    }
                }
                else{
                    break;
                }
            }
        }
        while(!comprueba);

        return comprueba;
    }


    public static void disparo(char[][] t, int intentos) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;

        do {


            System.out.println("Introduce la fila");

            int fila = entrada.nextInt();

            System.out.println("Introduce la columna");

            int columna = entrada.nextInt();

            if(t[fila][columna] == '-'){
                t[fila][columna] = 'A';
                System.out.println("Has fallado! Tu disparo ha caido al agua.");
            }
            else if(t[fila][columna] != '-'){
                t[fila][columna] = 'X';
                System.out.println("Has acertado!");
            }

            t[fila][columna] = '*';

            contador++;

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

        return entrada.nextInt();

    }
    public static void mostrar(char[][] tablero) {

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

        char[][] taule = tableroIA();

        int fila = 0;
        int columna = 0;

        lancha(taule);

        mostrar(taule);

        barco(taule);

        mostrar(taule);

        //mostrar(taule);






    }
}