public class ColorPoint extends Point {
    private int color;
    public ColorPoint(double x, double y, int color) {
        super(x, y);
        this.color = color;
    }

    public void print(){
        // Печатаем координаты
        super.print();
        // Печатаем цвет
        System.out.println(" and color " + color);
    }
}
