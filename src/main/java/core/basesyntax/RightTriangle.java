package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    @Override
    public void countArea() {
        this.setArea(Math.ceil(this.firstLeg * this.secondLeg / 2 * 10) / 10);
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.getArea()
                + " sq.units, firstLeg: " + this.firstLeg
                + " units, secondLeg: " + this.secondLeg
                + " units, color: " + this.getColor());
    }

    @Override
    public void randomAttributes() {
        this.firstLeg = new Random().nextInt(this.getBoundRandom()) + 1;
        this.secondLeg = new Random().nextInt(this.getBoundRandom()) + 1;
    }
}
