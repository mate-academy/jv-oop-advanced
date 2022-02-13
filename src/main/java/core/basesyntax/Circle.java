package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements Draw, FigureArea {
    private int radius;
    Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {

    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public Figure getRandomFigure() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
    }

    @Override
    public String getDraw() {
        return "Сircle: area: " +
                getArea() +
                " sq.units, " +
                "radius: " + radius +
                " units, " +
                "color: " + getColor();
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return getDraw();
    }
}
