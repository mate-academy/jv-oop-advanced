package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle() {
        super();
        Random random = new Random();
        this.width = Math.round(random.nextDouble(100) * 10.0) / 10.0;
        this.height = Math.round(random.nextDouble(100) * 10.0) / 10.0;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = Math.round(width * 10.0) / 10.0;
        this.height = Math.round(height * 10.0) / 10.0;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
