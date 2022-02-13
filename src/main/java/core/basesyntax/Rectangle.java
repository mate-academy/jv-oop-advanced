package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure implements Draw, FigureArea {
    private int width;
    private int height;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public Figure getRandomFigure() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10),
                random.nextInt(10));
    }

    @Override
    public String getDraw() {
        return "Rectangle: area: "
                + getArea()
                + " sq.units, "
                + "width: " + width
                + " units, "
                + "height: " + height
                + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return getDraw();
    }
}
