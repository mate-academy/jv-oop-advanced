package core.basesyntax.figures;

import core.basesyntax.abstraction.Figure;

public class Square extends Figure {
    private final int sizeOfSide;

    public Square(String color, int sizeOfSide) {
        super(color);
        this.sizeOfSide = sizeOfSide;
    }

    @Override
    public double getArea() {
        return sizeOfSide * sizeOfSide;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String figureName = "square";
        return "Figure: " + figureName + ", area: " + getArea() + " sq.units,"
                + " side: " + sizeOfSide + ", color: " + getColor();
    }
}
