package core.basesyntax.figures;

import core.basesyntax.util.Colors;

public class Circle extends Figure {

    private int rad;
    private Colors color;

    public Circle() {
        this.rad = getRandomNum();
    }

    public Circle(int rad, Colors color) {
        this.rad = rad;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * this.rad * this.rad;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea()
                + " sq. units, " + "radius: " + rad + " units, color: " + color);
    }
}
