package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle() {
        super();
        this.sideA = new Random().nextInt(100);
        this.sideB = new Random().nextInt(100);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle, area: "
                + String.format("%.2f", this.getArea()) + " sq. units, side A: "
                + this.sideA + " units, side B:"
                + this.sideB + " units, color: "
                + this.getColor());
    }

    public double getArea() {
        return sideA * sideB;
    }
}
