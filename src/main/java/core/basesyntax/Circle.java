package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private double radius;

    @Override
    public void countArea() {
        this.setArea(Math.ceil(Math.PI * this.radius * this.radius * 10) / 10);
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.getArea()
                + " sq.units, radius: " + this.radius
                + " units, color: " + this.getColor());
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void randomAttributes() {
        this.radius = new Random().nextInt(this.getBoundRandom()) + 1;
    }
}
