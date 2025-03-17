package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Square extends Rectangle {
    public Square(String color, double wall) {
        super(color, wall, wall);
    }

    @Override
    public void draw() {
        String sb = "Figure: Square, Color: " + getColor() + ", Wall: " + getFirstWall() + ", Area: " + getArea();

        System.out.println(sb);
    }
}
