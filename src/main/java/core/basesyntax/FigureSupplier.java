package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int NUM_FIGURES = 5;
    public static final int MAX_LENGTH = 10;
    private final Random random = new Random();
    private final ColorSupplier colorRandom = new ColorSupplier();

    public Figure getFigure() {
        switch (random.nextInt(NUM_FIGURES)) {
            case 0 : return getNewSquare();
            case 1 : return getNewRectangle();
            case 2 : return getNewRightTriangle();
            case 3 : return getNewCircle();
            default : return getNewIsoscelesTrapezoid();
        }
    }

    private Circle getNewCircle() {
        int radius = random.nextInt(MAX_LENGTH) + 1;
        String color = colorRandom.getNewColor();

        return new Circle(radius, color);
    }

    private Square getNewSquare() {
        int side = random.nextInt(MAX_LENGTH) + 1;
        String color = colorRandom.getNewColor();

        return new Square(side, color);
    }

    private Rectangle getNewRectangle() {
        int sideA = random.nextInt(MAX_LENGTH) + 1;
        int sideB = random.nextInt(MAX_LENGTH) + 1;
        String color = colorRandom.getNewColor();

        return new Rectangle(sideA, sideB, color);
    }

    private RightTriangle getNewRightTriangle() {
        int sideA = random.nextInt(MAX_LENGTH) + 1;
        int sideB = random.nextInt(MAX_LENGTH) + 1;
        String color = colorRandom.getNewColor();

        return new RightTriangle(sideA, sideB, color);
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        int hide = random.nextInt(MAX_LENGTH) + 1;
        int middleLine = random.nextInt(MAX_LENGTH) + 1;
        String color = colorRandom.getNewColor();

        return new IsoscelesTrapezoid(hide, middleLine, color);
    }
}
