package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final ColorEnum DEFAULT_COLOR = ColorEnum.WHITE;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();

        int numberOfFigures = FigureEnum.values().length;
        int index = random.nextInt(numberOfFigures);
        FigureEnum randomFiguresName = FigureEnum.values()[index];

        switch (randomFiguresName) {
            case CIRCLE:
                int randomRadius = randomLength();
                return new Circle(randomColor, randomRadius);
            case ISOSCELES_TRAPEZOID:
                int randomBottomSide = randomLength();
                int randomTopSide = randomLength();
                int randomHeight = randomLength();
                return new IsoscelesTrapezoid(randomColor,
                        randomBottomSide, randomTopSide, randomHeight
                );
            case RECTANGLE:
                int randomFirstSide = randomLength();
                int randomSecondSide = randomLength();
                return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
            case RIGHT_TRIANGLE:
                int randomFirstLeg = randomLength();
                int randomSecondLeg = randomLength();
                return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
            default: // SQUARE
                int randomSide = randomLength();
                return new Square(randomColor, randomSide);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }

    private int randomLength() {
        return MIN_LENGTH + random.nextInt(MAX_LENGTH);
    }
}
