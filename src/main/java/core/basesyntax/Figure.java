package core.basesyntax;

import java.awt.*;

public abstract class Figure {
    ColorSupplier colorSupplier = new ColorSupplier();
    String color = colorSupplier.getRandomColor();
    double square;

    public abstract double calculateTheSquare();
}
