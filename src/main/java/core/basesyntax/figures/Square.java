package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("square area: "
                + obtainArea()
                + " side: "
                + side
                + " color: "
                + color);
    }
}


