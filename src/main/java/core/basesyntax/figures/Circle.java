package core.basesyntax.figures;

import core.basesyntax.Figure;

import static core.basesyntax.RandomInt.getRandomInt;

public class Circle extends Figure {
    private int radius;
    private String figureName = "circle";

    @Override
    public void getInfo() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setRandomProperties() {
        setRadius(getRandomInt(20));
    }
}
