package core.basesyntax;

import static java.lang.Math.*;

public class Circle extends Figure {

    private final double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double GetArea() {
        return PI * (pow(radius, 2));
    }

    @Override
    public void GetPrint() {
        System.out.println("Figura: Trójkąt " + "Pole: " + (PI * (pow(radius, 2))) + " Kolor: " + getColor());
    }
}
