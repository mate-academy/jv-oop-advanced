package core.basesyntax.figures;

import core.basesyntax.figures.behaviour.Drawable;
import core.basesyntax.figures.behaviour.State;

public class Square extends State implements Drawable {//Kwadrat
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
    public String draw() {
        return "Figure: Square, " +
                "side: " + side +
                ", color='" + color;
    }
}
