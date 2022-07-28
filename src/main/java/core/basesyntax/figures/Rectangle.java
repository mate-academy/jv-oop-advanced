package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import java.util.Random;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Color color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void printArea() {
        System.out.println(width * height);
    }

    @Override
    public Figure getRandomParameters() {
        Random random = new Random();
        int max = Figure.MAX_VALUE_OF_PARAM;
        Color rectangleColor = new ColorSupplier().getRandomColor();
        return new Rectangle(rectangleColor, random.nextInt(max), random.nextInt(max));
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, height: " + height + " units, color: " + getColor();
    }
}
