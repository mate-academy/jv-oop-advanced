package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(Random random) {
        this.radius = random.nextInt(100);
        setColor(ColorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void printInformation() {
        System.out.println(getStringBuilder().append(System.lineSeparator()).append(
                        "This is a CIRCLE ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("Radius = ").append(radius)
                .append(System.lineSeparator()).append("Area = ").append(getArea()).toString());
    }

    public Circle getRandomFigure() {
        return new Circle();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
