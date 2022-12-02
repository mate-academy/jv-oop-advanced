package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements IAreaCalculator {
    private double radius;

    public Circle(String name, String color) {
        super(name, color);
        this.radius = getRandomSide();
    }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor() + ".");
    }

    @Override
    public int getRandomSide() {
        int side = new Random().nextInt(100);
        return side;
    }
}
