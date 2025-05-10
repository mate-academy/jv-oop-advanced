package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class Square extends Figure {
    private static final String TYPE = "square";
    private double side;
    private final Random random = new Random();

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
  public double calculateArea() {
        return side * side;
    }

    @Override
  public void draw() {
        System.out.println("Figure: " + TYPE + ", area: " + getRoundedValue(calculateArea())
                + " sq. units, side: " + getRoundedValue(side) + " units, color: " + getColor());
    }
}
