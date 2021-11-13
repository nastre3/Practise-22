import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sin(PI/4)); // можно использовать функцию без указания класса
/*
Make (add code to class Tank),
with fuel and different constructors
*/

        // At (0;0) fuel=100
        Tank justTank = new Tank();
        // At (10;20) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

/*
This fragment of code has to output

The Tank is at -100, 0 now.
The Tank is at 120, -10 now.
The Tank is at 170, 30 now.

*/
    }
}
