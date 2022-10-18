package core.basesyntax.figures;

import core.basesyntax.behavior.CalculateArea;
import core.basesyntax.behavior.Drawable;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculate() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                ", color='" + getColor() +
                ", area='" + calculate() +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
