package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int RANDOM_SIDE = 50;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int someFigure = random.nextInt(NUMBER_OF_FIGURES);
        switch (someFigure) {
            case 0:
                return newCircle();
            case 1:
                return newRectangle();
            case 2:
                return newSquare();
            case 3:
                return newIsoscelesTrapezoid();
            default:
                return newRightTriangle();
        }

    }

    private Circle newCircle() {
        int radius = random.nextInt(RANDOM_SIDE);
        return new Circle(radius);
    }

    private Rectangle newRectangle() {
        int sideA = random.nextInt(RANDOM_SIDE);
        int sideB = random.nextInt(RANDOM_SIDE);
        return new Rectangle(sideA, sideB);
    }

    private RightTriangle newRightTriangle() {
        double side = random.nextInt(RANDOM_SIDE);
        double height = random.nextInt(RANDOM_SIDE);
        return new RightTriangle(side, height);
    }

    private Square newSquare() {
        int side = random.nextInt(RANDOM_SIDE);
        return new Square(side);
    }

    private IsoscelesTrapezoid newIsoscelesTrapezoid() {
        double sideA = random.nextInt(RANDOM_SIDE);
        double sideB = random.nextInt(RANDOM_SIDE);
        double height = random.nextInt(RANDOM_SIDE);
        return new IsoscelesTrapezoid(sideA, sideB, height);
    }
}
