package core.basesyntax.figures;

import core.basesyntax.util.Colors;

public class Circle extends Figure {

    private int rad;

    public Circle(Colors color) {
        super(color);
        this.rad = getRandomNum();
    }

    public Circle(Colors color, int rad) {
        super(color);
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return Math.PI * this.rad * this.rad;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea()
                + " sq. units, " + "radius: " + rad + " units, color: " + getColor());
    }
}
