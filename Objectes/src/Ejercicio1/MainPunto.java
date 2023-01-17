package Ejercicio1;

public class MainPunto {
    public static void main(String[] args) {

        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();

        p1.x = 5;
        p1.y = 0;

        p2.x = 10;
        p2.x = 10;

        p3.x = -3;
        p3.y = 7;

        System.out.println('(' + p1.x + ',' + p1.y+ ')');
        System.out.println('(' + p2.x + ',' + p2.y+ ')');
        System.out.println('(' + p3.x + ',' + p3.y+ ')');

        p1.x += 5;
        p1.y *= 2;

        p2.x /= 2;
        p2.y += 25;

        p3.x /= 3;
        p3.y *= 12;

        System.out.println();
        System.out.println("Despues de conversion");
        System.out.println('(' + p1.x + ',' + p1.y+ ')');
        System.out.println('(' + p2.x + ',' + p2.y+ ')');
        System.out.println('(' + p3.x + ',' + p3.y+ ')');

    }
}
