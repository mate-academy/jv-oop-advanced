package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_NUMBER = 5;
    public static final int FIGURES_COUNT = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getFigure() {
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0 : return getNewSquare();
            case 1 : return getNewRectangle();
            case 2 : return getNewRightTriangle();
            case 3 : return getNewCircle();
            default : return getNewIsoscelesTrapezoid();
        }
    }

    private Circle getNewCircle() {
        int radius = random.nextInt(FIGURES_COUNT) + 1;
        String color = colorSupplier.getNewColor();

        return new Circle(radius, color);
    }

    private Square getNewSquare() {
        int side = random.nextInt(FIGURES_COUNT) + 1;
        String color = colorSupplier.getNewColor();

        return new Square(side, color);
    }

    private Rectangle getNewRectangle() {
        int sideA = random.nextInt(FIGURES_COUNT) + 1;
        int sideB = random.nextInt(FIGURES_COUNT) + 1;
        String color = colorSupplier.getNewColor();

        return new Rectangle(sideA, sideB, color);
    }

    private RightTriangle getNewRightTriangle() {
        int sideA = random.nextInt(FIGURES_COUNT) + 1;
        int sideB = random.nextInt(FIGURES_COUNT) + 1;
        String color = colorSupplier.getNewColor();

        return new RightTriangle(sideA, sideB, color);
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        int hide = random.nextInt(FIGURES_COUNT) + 1;
        int middleLine = random.nextInt(FIGURES_COUNT) + 1;
        String color = colorSupplier.getNewColor();

        return new IsoscelesTrapezoid(hide, middleLine, color);
    }
}
