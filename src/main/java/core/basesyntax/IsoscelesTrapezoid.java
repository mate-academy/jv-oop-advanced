package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int biggerBaseSide;
    private int smallerBaseSide;
    private double side;
    private int height;

    public IsoscelesTrapezoid() {
        super();
        int firstRandomInt = new Random().nextInt(1, 10);
        int secondRandomInt = new Random().nextInt(1, 10);
        if (firstRandomInt > secondRandomInt) {
            biggerBaseSide = firstRandomInt;
            smallerBaseSide = secondRandomInt;
        } else {
            smallerBaseSide = firstRandomInt;
            biggerBaseSide = secondRandomInt;
        }
        this.height = 10;
        this.side = getSide();
    }

    @Override
    public double getArea() {
        return (double) (biggerBaseSide + smallerBaseSide) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("\nIsosceles trapezoid "
                + "color: " + this.getColor()
                + " area: " + this.getArea()
                + " bigger base: " + biggerBaseSide
                + " smaller base: " + smallerBaseSide
                + " side: " + side
                + " height: " + height);
    }

    private double getSide() {
        if (biggerBaseSide == smallerBaseSide) {
            return height;
        }

        return Math.sqrt(Math.pow(((double) (biggerBaseSide - smallerBaseSide) / 2), 2)
                + Math.pow(height, 2));
    }
}
