package core.basesyntax.figures;

import core.basesyntax.figures.AreaCalculator;
import core.basesyntax.figures.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Side : %s",
                side));
    }
}
