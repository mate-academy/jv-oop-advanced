package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {

    public Circle() {
    }

    public Circle(int radius, Color color) {
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public void draw() {
        System.out.print("Figure:" + new Circle()
                + "area:" + new Circle().getArea() + "units"
                + "side:" + getRadius() + "units"
                + "color:" + colorSupplier.getRandomColor());
    }
}
