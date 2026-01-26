package core.basesyntax;

import java.util.Random;

public class Square extends AbstractFigure {
    private Random random;
    private double side;

    public Square() {
        this.random = new Random();
        this.side = random.nextDouble(100, 1000);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square: units, area: "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColor());
    }
}
