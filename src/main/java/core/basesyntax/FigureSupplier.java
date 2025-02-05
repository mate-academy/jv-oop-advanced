package core.basesyntax;

import core.basesyntax.shape.*;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        double randomSize = random.nextDouble() * 10 +1;
        String color = colorSupplier.getRandomColor().toString();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0: // square
                return new Square(color,randomSize);
            case 1: // rectangle
                return new Rectangle(color, randomSize, randomSize);
            case 2: // right triangle
                return new RightTriangle(color,randomSize, randomSize);
            case 3: // circle
                return new Circle(color, randomSize);
            case 4: // isosceles trapezoid
                return new IsoscelesTrapezoid(color, randomSize, randomSize, randomSize);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
