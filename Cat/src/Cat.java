public class Cat {
    //Поля класса
    double weight;
    String name;
    int age;
    String color;
    private static int catCount; //Статичное поле

    // конструктор по умолчанию (без параметров)
    public Cat() {
        this(6000, "Bersi", 3, "White");
    }

    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++; //Увеличиваем счётчик кошек
    }

    public void meow() {
        System.out.println("Meow");
    }

    private void pee() {
        weight -= 20;
        if (50 / weight > .01) pee();
    }

    public void eat() {
        weight += 50;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //кошки не молодеют
        if (age > this.age)
            this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        meow(); meow(); meow();
    }
}
