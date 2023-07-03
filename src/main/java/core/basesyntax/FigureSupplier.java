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
    final static int DEFAULT_RADIUS = 10;
    final static ColorEnum DEFAULT_COLOR = ColorEnum.WHITE;


    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();

        int numberOfFigures = FigureEnum.values().length;
        int index = random.nextInt(numberOfFigures);
        FigureEnum randomFiguresName = FigureEnum.values()[index];

        switch (randomFiguresName) {
            case CIRCLE:
                int randomRadius = getRandomLength();
                return new Circle(randomColor, randomRadius);
            case ISOSCELES_TRAPEZOID:
                int randomBottomSide = getRandomLength();
                int randomTopSide = getRandomLength();
                int randomHeight = getRandomLength();
                return new IsoscelesTrapezoid(randomColor,
                        randomBottomSide, randomTopSide, randomHeight
                );
            case RECTANGLE:
                int randomFirstSide = getRandomLength();
                int randomSecondSide = getRandomLength();
                return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
            case RIGHT_TRIANGLE:
                int randomFirstLeg = getRandomLength();
                int randomSecondLeg = getRandomLength();
                return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
            default: // SQUARE
                int randomSide = getRandomLength();
                return new Square(randomColor, randomSide);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }

    private int getRandomLength() {
        return MIN_LENGTH + random.nextInt(MAX_LENGTH);
    }
}
