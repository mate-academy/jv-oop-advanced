package core.basesyntax.model;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square implements Figure {
    private final Color color;
    private  final double side;

    public Square(Color color, double side){
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Color: " + color.name()
        + "Type: Square "
        + "Side: " + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
