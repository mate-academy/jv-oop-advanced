package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private double side;

    @Override
    public void countArea() {
        this.setArea(Math.ceil(this.side * this.side * 10) / 10);
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.getArea()
                + " sq.units, side: " + this.side
                + " units, color: " + this.getColor());
    }

    @Override
    public void randomAttributes() {
        this.side = new Random().nextInt(this.getBoundRandom()) + 1;
    }
}
