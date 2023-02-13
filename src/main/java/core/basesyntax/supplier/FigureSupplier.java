package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT_RANDOM = 15;
    private static final int NUMBERS_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(NUMBERS_OF_FIGURES);
        int firstSide = random.nextInt(LIMIT_RANDOM);
        int secondSide = random.nextInt(LIMIT_RANDOM);

        switch (figureNumber) {
            case 0:
                return getRandomSquare(colorSupplier.getRandomColor(), firstSide);
            case 1:
                return getRandomRectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
            case 2:
                return getRandomRightTriangle(colorSupplier.getRandomColor(), firstSide,
                        secondSide);
            case 3:
                int thirdSide = random.nextInt(LIMIT_RANDOM);
                String color = colorSupplier.getRandomColor();
                return getRandomIsoscelesTrapezoid(color, firstSide, secondSide, thirdSide);
            default:
                return getDefultFigure();
        }
    }

    public Figure getDefultFigure() {
        return new Circle("WHITE", DEFAULT_RADIUS);
    }

    private Square getRandomSquare(String color, int side) {
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle(String color, int firstSide, int secondSide) {
        return new Rectangle(color, firstSide, secondSide);
    }

    private RightTriangle getRandomRightTriangle(String color, int firstSide, int secondSide) {
        return new RightTriangle(color, firstSide, secondSide);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(String color, int firstSide,
                                                           int secondSide, int thirdSide) {
        return new IsoscelesTrapezoid(color, firstSide, secondSide, thirdSide);
    }
}
