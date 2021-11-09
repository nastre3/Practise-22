public class Tank {
    int x = 0;
    int y = 0;
    int dir;
    
    public Tank() {
        this(0, 0);
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //0 - вправо, 1  - вниз, 2  - влево, 3 - вверх
    public void goForward(int x) {
        if (dir==0) this.x += x;
        else if (dir == 1) y+=x;
        else if (dir == 2) this.x -= x;
        else y -=x;
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
