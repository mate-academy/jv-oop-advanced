package core.basesyntax.figures;

import core.basesyntax.constants.ColorName;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(ColorName color, int length, int width) {
        super(color);
        this.firstSide = length;
        this.secondSide = width;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", first side: " + firstSide
                + ", second side: " + secondSide
                + ", area: " + calculateArea()
                + ".");
    }
}
