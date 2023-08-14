package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.figure.*;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public double getRandomlength() {
        return random.nextDouble();
    }

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (indexOfFigure) {
            case 0:
                return new Circle(color, getRandomlength());
            case 1:
                return new IsoscelesTrapezoid(color, getRandomlength(), getRandomlength(),getRandomlength());
            case 2:
                return new Rectangle(color, getRandomlength(), getRandomlength());
            case 3:
                return new RightTriangle(color, getRandomlength(), getRandomlength());
            case 4:
                return new Square(color, getRandomlength());
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
