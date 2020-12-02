package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class RightTriangle extends Figure {

    private int base;
    private int height;

    public RightTriangle(Color color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
        System.out.println("####");
        System.out.println("#####");
        System.out.println("######");
    }

    @Override
    public double getSquare() {
        return base * height / 2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return getColor() + " " + getClass().getSimpleName() + " with base "
                + getBase() + " units, height " + getHeight()
                + " units, and square " + getSquare() + " sq. units.";
    }
}
