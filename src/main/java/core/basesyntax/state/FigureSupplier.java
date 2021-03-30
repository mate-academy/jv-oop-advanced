package core.basesyntax.state;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class FigureSupplier {
    private static final int RANDOM_NUMBER = 10;
    private static String [] figureArray = {"Circle", "Isosceles Trapezoid", "Rectangle",
            "Right Triangle", "Square"};

    public static Figure getRandomFigure() {
        int randomFigureNumber = (int)(Math.random() * figureArray.length);

        switch (randomFigureNumber) {
            case 0:
                return new Circle(figureArray[randomFigureNumber], ColorSupplier.getRandomColor(),
                        getRandomNumber());
            case 1:
                return new IsoscelesTrapezoid(figureArray[randomFigureNumber],
                        ColorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            case 2:
                return new Rectangle(figureArray[randomFigureNumber],
                        ColorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new RightTriangle(figureArray[randomFigureNumber],
                        ColorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            default:
                return new Square(figureArray[randomFigureNumber], ColorSupplier.getRandomColor(),
                        getRandomNumber());
        }

    }

    private static int getRandomNumber() {
        return (int)((Math.random() * RANDOM_NUMBER) + 1);
    }
}
