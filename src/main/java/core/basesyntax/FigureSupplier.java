package core.basesyntax;

import core.basesyntax.figures.AbstractFigure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES_BOUND = 4;
    private static final int MAX_VALUE_BOUND = 100;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public AbstractFigure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigureNumber = getRandomNumber(NUMBER_OF_FIGURES_BOUND);
        switch (randomFigureNumber) {
            case 0:
                double randomRadius = getRandomNumber(MAX_VALUE_BOUND);
                return new Circle(randomColor, randomRadius);
            case 1:
                double randomFirstBaseSide = getRandomNumber(MAX_VALUE_BOUND);
                double randomSecondBaseSide = getRandomNumber(MAX_VALUE_BOUND);
                double randomHeight = getRandomNumber(MAX_VALUE_BOUND);
                double randomSide = getRandomNumber(MAX_VALUE_BOUND);
                return new IsoscelesTrapezoid(randomColor, randomFirstBaseSide,
                        randomSecondBaseSide, randomHeight, randomSide);
            case 2:
                double randomRectangleWidth = getRandomNumber(MAX_VALUE_BOUND);
                double randomRectangleHeight = getRandomNumber(MAX_VALUE_BOUND);
                return new Rectangle(randomColor, randomRectangleWidth, randomRectangleHeight);
            case 3:
                double randomFirstLeg = getRandomNumber(MAX_VALUE_BOUND);
                double randomSecondLeg = getRandomNumber(MAX_VALUE_BOUND);
                double randomHypotenuse = getRandomNumber(MAX_VALUE_BOUND);
                return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg,
                        randomHypotenuse);
            default:
                double randomSquareSide = getRandomNumber(MAX_VALUE_BOUND);
                return new Square(randomColor, randomSquareSide);
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomNumber(int value) {
        return random.nextInt(value);
    }
}
