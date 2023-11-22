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
        double area = calculateArea();
        double roundedArea = Math.round(area * 100.0) / 100.0;
        double roundedSide = Math.round(side * 100.0) / 100.0;

        System.out.println("Figure: " + TYPE + ", area: " + roundedArea + " sq. units, side: "
                + roundedSide + " units, color: " + getColor());
    }
}
