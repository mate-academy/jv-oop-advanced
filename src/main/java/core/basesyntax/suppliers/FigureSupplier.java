package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = getRandomNumber(FIGURE_COUNT);
        switch (randomNumber) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomTriangle();
            case 5:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }

    private Figure getRandomCircle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = getRandomNumber(MAX_RANDOM_NUMBER);
        return new Circle(randomColor, randomRadius);
    }

    private Figure getRandomTrapezoid() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFirstSide = getRandomNumber(MAX_RANDOM_NUMBER);
        int randomSecondSide = getRandomNumber(MAX_RANDOM_NUMBER);
        int randomHeight = getRandomNumber(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(randomColor, randomFirstSide, randomSecondSide, randomHeight);
    }

    private Figure getRandomRectangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFirstSide = getRandomNumber(MAX_RANDOM_NUMBER);
        int randomSecondSide = getRandomNumber(MAX_RANDOM_NUMBER);
        return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
    }

    private Figure getRandomTriangle() {
        String randomColor = colorSupplier.getRandomColor();
        int firstLeg = getRandomNumber(MAX_RANDOM_NUMBER);
        int secondLeg = getRandomNumber(MAX_RANDOM_NUMBER);
        return new RightTriangle(randomColor, firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide = getRandomNumber(MAX_RANDOM_NUMBER);
        return new Square(randomColor, randomSide);
    }

    private int getRandomNumber(int maxInt) {
        return random.nextInt(maxInt) + 1;
    }
}
