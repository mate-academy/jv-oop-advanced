package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double sideA;
    private double sideC;

    @Override
    public void countArea() {
        this.setArea(Math.ceil((this.sideC + this.sideA) * this.height / 2 * 10) / 10);
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.getArea()
                + " sq.units, sideA: " + this.sideA
                + " units, sideC: " + this.sideC
                + " units, height: " + this.height
                + " units, color: " + this.getColor());
    }

    @Override
    public void randomAttributes() {
        this.sideA = new Random().nextInt(this.getBoundRandom()) + 1;
        this.sideC = new Random().nextInt(this.getBoundRandom()) + 10;
        this.height = new Random().nextInt(this.getBoundRandom()) + 1;

    }
}
