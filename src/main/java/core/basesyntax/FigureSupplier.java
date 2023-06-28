package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    enum FiguresEnum {
        CIRCLE,
        ISOSCELES_TRAPEZOID,
        RECTANGLE,
        RIGHT_TRIANGLE,
        SQUARE

    }

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int randNum() {
        return MIN_LENGTH + random.nextInt(MAX_LENGTH);
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();

        int numberOfFigures = FiguresEnum.values().length;
        int index = random.nextInt(numberOfFigures);
        FiguresEnum randomFiguresName = FiguresEnum.values()[index];

        switch (randomFiguresName) {
            case CIRCLE:
                int randomRadius = randNum();
                return new Circle(randomColor, randomRadius);
            case ISOSCELES_TRAPEZOID:
                int randomBottomSide = randNum();
                int randomTopSide = randNum();
                int randomHeight = randNum();
                return new IsoscelesTrapezoid(randomColor,
                        randomBottomSide, randomTopSide, randomHeight
                );
            case RECTANGLE:
                int randomFirstSide = randNum();
                int randomSecondSide = randNum();
                return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
            case RIGHT_TRIANGLE:
                int randomFirstLeg = randNum();
                int randomSecondLeg = randNum();
                return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
            default: // SQUARE
                int randomSide = randNum();
                return new Square(randomColor, randomSide);
        }
    }

    public Figure getDefaultFigure() {
        final int defaultRadius = 10;
        final ColorSupplier.Color defaultColor = ColorSupplier.Color.WHITE;
        return new Circle(defaultColor.name(), defaultRadius);
    }
}
