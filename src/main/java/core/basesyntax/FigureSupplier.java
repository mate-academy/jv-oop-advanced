package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MAX_RANDOM_FIGURES = 5;
    private static final int DEFAULT_RADIUS_LENGTH = 10;
    private String randomColor = new ColorSupplier().getRandomColor();
    private int firstRandomNumber = new Random().nextInt(MAX_RANDOM_NUMBER) + 1;
    private int secondRandomNumber = new Random().nextInt(MAX_RANDOM_NUMBER) + 1;
    private int thirdRandomNumber = new Random().nextInt(MAX_RANDOM_NUMBER) + 1;

    public Figure getRandomFigure() {
        int randomIndex = new Random().nextInt(MAX_RANDOM_FIGURES);
        return switch (randomIndex) {
            case 0 -> getCircle();
            case 1 -> getIsoscelesTrapezoid();
            case 2 -> getRectangle();
            case 3 -> getSquare();
            case 4 -> getRightTriangle();
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS_LENGTH);
    }

    private Figure getCircle() {
        return new Circle(randomColor, firstRandomNumber);
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor,
                firstRandomNumber, secondRandomNumber, thirdRandomNumber);
    }

    private Figure getRectangle() {
        return new Rectangle(randomColor, firstRandomNumber, secondRandomNumber);
    }

    private Figure getSquare() {
        return new Square(randomColor, firstRandomNumber);
    }

    private Figure getRightTriangle() {
        return new RightTriangle(randomColor, firstRandomNumber, secondRandomNumber);
    }
}
