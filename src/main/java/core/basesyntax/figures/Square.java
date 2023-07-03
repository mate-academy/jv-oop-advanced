package core.basesyntax.figures;

import core.basesyntax.constants.ColorName;

public class Square extends Figure {
    private final int size;

    public Square(ColorName color, int size) {
        super(color);
        this.size = size;
    }

    @Override
    public double calculateFigureArea() {
        return (double) size * size;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", size: " + size
                + ", area: " + calculateFigureArea()
                + ".");
    }
}
