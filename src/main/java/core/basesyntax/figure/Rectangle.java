package core.basesyntax.figure;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("firstSide: " + firstSide + ", secondSide: " + secondSide);
        super.draw();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
