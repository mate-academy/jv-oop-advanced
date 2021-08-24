package core.basesyntax.figures;

import core.basesyntax.Area;
import core.basesyntax.Figure;

public class Square extends Figure {
    double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double obtainArea() {

        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("square area: " + obtainArea() + " side: " + side + " color: " + color);
    }
}


