package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        super();
        this.firstLeg = new Random().nextInt(10);
        this.secondLeg = new Random().nextInt(10);
    }

    @Override
    public void draw() {
        System.out.println("right triangle, area: " + this.getArea()
                + " sq.units, firstLeg: " + this.firstLeg + " units, secondLeg: "
                + this.secondLeg + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return (double) this.firstLeg * this.secondLeg / 2;
    }
}
