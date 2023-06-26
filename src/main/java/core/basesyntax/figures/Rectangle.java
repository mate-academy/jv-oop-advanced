package core.basesyntax.figures;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double diagonal;

    public Rectangle(Color color, double firstSide, double secondSide, double diagonal) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.diagonal = diagonal;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle{"
                + "color=" + color
                + ", firstSide=" + firstSide
                + ", secondSide=" + secondSide
                + ", diagonal=" + diagonal
                + ", area=" + getArea()
                + '}');
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
