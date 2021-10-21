package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    @Override
    public void countArea() {
        this.setArea(Math.ceil(this.sideA * this.sideB * 10) / 10);
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.getArea()
                + " sq.units, sideA: " + this.sideA
                + " units, sideB: " + this.sideB
                + " units, color: " + this.getColor());
    }

    @Override
    public void randomAttributes() {
        this.sideA = new Random().nextInt(this.getBoundRandom()) + 1;
        this.sideB = new Random().nextInt(this.getBoundRandom()) + 1;
    }
}
