package core.basesyntax;

import java.util.Random;

public class Circle  extends Shape {

    Random rand;
    private double roundness; // Окружность

    public Circle(String name, String color){
        super(name, color);
        rand = new Random();
        this.roundness = rand.nextInt(20);
    }

    @Override
    public double calculateArea() {
        return 0.0;
    }

    @Override
    public double perimeter() {
        return 0.0;
    }

    @Override
    public void draw() {

    }

    @Override
    public String info() {
        return null;
    }

}
