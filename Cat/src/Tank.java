import static java.lang.Math.abs;

public class Tank {
    int x = 0;
    int y = 0;
    int dir;
    int fuel = 100;
    
    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public Tank(int x, int y) {
        this();
    }

    //0 - вправо, 1  - вниз, 2  - влево, 3 - вверх
    public void goForward(int x) {
        while (fuel!=0) {
            if (dir==0) this.x += x;
            else if (dir == 1) y+=x;
            else if (dir == 2) this.x -= x;
            else y -=x;
            fuel-=abs(x);
        }
    }

    public void goBackward(int x) {
            goForward(-x);
    }

    public void printPosition() {
        System.out.printf("The Tank is at %d, %d now.\n", x, y);
        System.out.println();
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }
}
