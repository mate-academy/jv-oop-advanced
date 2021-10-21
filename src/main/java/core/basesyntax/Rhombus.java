package core.basesyntax;

import java.util.Random;

public class Rhombus extends Figure {
    private double angle;
    private double side;

    @Override
    public void countArea() {
        this.setArea(Math.ceil(this.side * this.side
                * Math.sin(Math.toRadians(this.angle)) * 10) / 10);
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.getArea()
                + " sq.units, side: " + this.side
                + " units, angle: " + this.angle
                + " units, color: " + this.getColor());
    }

    @Override
    public void randomAttributes() {
        this.angle = new Random().nextInt(89) + 1;
        this.side = new Random().nextInt(this.getBoundRandom()) + 1;
    }
}
