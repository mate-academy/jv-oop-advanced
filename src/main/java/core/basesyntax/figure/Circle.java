package core.basesyntax.figure;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * (pow(radius, 2));
    }

    @Override
    public void print() {
        System.out.println("Figura: Koło " + "Pole: " + (PI * (pow(radius, 2))) + " Promień: "
                + radius + " Kolor: " + getColor());
    }
}
