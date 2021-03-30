package core.basesyntax.state;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class FigureSupplier {
    private static String [] figureArray = {"Circle", "Isosceles Trapezoid", "Rectangle",
            "Right Triangle", "Square"};

    public static Figure getRandomFigure() {
        int randomNumber = (int)(Math.random() * figureArray.length);

        switch (randomNumber) {
            case 0:
                return new Circle(figureArray[randomNumber], ColorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(figureArray[randomNumber],
                        ColorSupplier.getRandomColor());
            case 2:
                return new Rectangle(figureArray[randomNumber], ColorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(figureArray[randomNumber], ColorSupplier.getRandomColor());
            default:
                return new Square(figureArray[randomNumber], ColorSupplier.getRandomColor());
        }

    }
}
