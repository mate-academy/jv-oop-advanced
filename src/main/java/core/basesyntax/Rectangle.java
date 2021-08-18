package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle() {
        super();
        this.sideA = new Random().nextInt(10);
        this.sideB = new Random().nextInt(10);
    }

    @Override
    public void draw() {
        System.out.println("rectangle, area: " + this.sideA * this.sideB + " sq.units, side A: "
                + this.sideA + " units, side B: " + this.sideB + " units, color: "
                + super.getColor());
    }
}
