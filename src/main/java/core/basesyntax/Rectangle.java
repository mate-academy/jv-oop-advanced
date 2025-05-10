package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle() {
        super();
        this.firstSide = new Random().nextInt(1, 10);
        this.secondSide = new Random().nextInt(1, 10);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("\nRectangle "
                + "color: " + this.getColor()
                + " area: " + this.getArea()
                + " first side: " + firstSide
                + " first side: " + secondSide);
    }
}
