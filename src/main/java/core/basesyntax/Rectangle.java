package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;
    private Random random = new Random();

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle() {
        firstSide = random.nextDouble();
        secondSide = random.nextDouble();
        setColor(random);
        this.color = getColor();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, first side: "
                + firstSide + " units, second side: " + secondSide + " units, color: " + color);
    }
}
