package core.basesyntax.figures.figurehandlers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int RANDOM_VALUES_BORDER = 30;
    private final Figure defaultFigure = new Circle("White", 10);

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURES_COUNT) + 1;

        switch (randomIndex) {
            case 1: {
                String color = colorSupplier.getRandomColor();
                int radius = getRandomValue();
                return getRandomCircle(color, radius);
            }
            case 2: {
                String color = colorSupplier.getRandomColor();
                int lowBase = getRandomValue();
                int highBase = getRandomValue();
                int leg = getRandomValue();
                int height = getRandomValue();
                return getRandomIsoscelesTrapezoid(color, lowBase, highBase, leg, height);
            }
            case 3: {
                String color = colorSupplier.getRandomColor();
                int hypotenuse = getRandomValue();
                int firstLeg = getRandomValue();
                int secondLeg = getRandomValue();
                return new RightTriangle(color, hypotenuse, firstLeg, secondLeg);
            }
            case 4: {
                String color = colorSupplier.getRandomColor();
                int firstSide = getRandomValue();
                int secondSide = getRandomValue();
                return new Rectangle(color, firstSide, secondSide);
            }
            case 5: {
                String color = colorSupplier.getRandomColor();
                int side = getRandomValue();
                return new Square(color, side);
            }
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }

    private Circle getRandomCircle(String color, int radius) {
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(String color, int lowBase,
                                                           int highBase, int leg, int height) {
        return new IsoscelesTrapezoid(color, lowBase, highBase, leg, height);
    }

    private RightTriangle getRandomRightTriangle(String color, int hypotenuse,
                                                 int firstLeg, int secondLeg) {

        return new RightTriangle(color, hypotenuse, firstLeg, secondLeg);
    }

    private Rectangle getRandomRectangle(String color, int firstSide, int secondSide) {
        return new Rectangle(color, firstSide, secondSide);
    }

    private Square getRandomSquare(String color, int side) {
        return new Square(color, side);
    }

    private int getRandomValue() {
        return random.nextInt(RANDOM_VALUES_BORDER + 1) + 1;
    }
}
