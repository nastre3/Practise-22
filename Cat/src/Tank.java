import static java.lang.Math.abs;

public class Tank {
    static int tankCount; //Статичное поле
    static final String MODEL = "T34";

    private  int x = 0;
    private  int y = 0;
    private  int dir = 0;
    private int fuel = 100;
    private int n;

    
    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++tankCount;
    }

    public Tank(int x, int y) {
        this(x,y, 100);
    }

    //0 - вправо, 1  - вниз, 2  - влево, 3 - вверх
    public void goForward(int x) {
        // if (i < 0 && -i > -fuel)
        // i = -fuel;
        if (fuel<=abs(x)) {
            x = fuel;
            // x>0 x=200, fuel = 100, res = 100 -> x-=fuel
            // x<0 x=-200, fuel = 100, res = -100 -> x+=fuel
        }
        fuel-=abs(x);
            if (dir==0) this.x += x;
            else if (dir == 1) y+=x;
            else if (dir == 2) this.x -= x;
            else y -=x;
        }

    public void goBackward(int x) {
            goForward(-x);
    }

    public void printPosition() {
        System.out.printf("The Tank %s-%d is at %d, %d now.\n", MODEL, n, x, y);
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
