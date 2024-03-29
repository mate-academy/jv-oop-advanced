package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle() {
        this.firstSide = new Random().nextInt(15);
        this.secondSide = new Random().nextInt(15);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: rectangle, first side: "
                + firstSide + ", second side: "
                + secondSide + ", area: "
                + getArea() + ", color: " + getColor()));
    }
}
