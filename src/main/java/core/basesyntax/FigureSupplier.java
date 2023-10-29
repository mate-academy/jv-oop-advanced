package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static Figure defaultFigure;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        // Should I pass this random object to color supplier constructor, or it is bad practice ?
        // And is it better to create another random class in color supplier ?
        this.random = new Random();
        this.colorSupplier = new ColorSupplier(random);
    }

    public Figure getRandomFigure() {
        final int maxLengthInUnits = 100;
        final int figuresTypesNumber = 5;
        int randomChoice = random.nextInt(figuresTypesNumber);
        String randomColor = colorSupplier.getRandomColor();

        double firstLength;
        double secondLength;
        double thirdLength;
        switch (randomChoice) {
            case 0:
                firstLength = random.nextDouble() * maxLengthInUnits;
                return new Circle(randomColor, firstLength);
            case 1:
                firstLength = random.nextDouble() * maxLengthInUnits;
                return new Square(randomColor, firstLength);
            case 2:
                firstLength = random.nextDouble() * maxLengthInUnits;
                secondLength = random.nextDouble() * maxLengthInUnits;
                return new Rectangle(randomColor, firstLength, secondLength);
            case 3:
                firstLength = random.nextDouble() * maxLengthInUnits;
                secondLength = random.nextDouble() * maxLengthInUnits;
                return new RightTriangle(randomColor, firstLength, secondLength);
            case 4:
                firstLength = random.nextDouble() * maxLengthInUnits;
                secondLength = random.nextDouble() * maxLengthInUnits;
                thirdLength = random.nextDouble() * maxLengthInUnits;
                return new IsoscelesTrapezoid(randomColor, firstLength, secondLength, thirdLength);
            default:
                assert false : "Default case should not be reached.";
                return null;
        }

    }

    public Figure getDefaultFigure() {
        if (defaultFigure == null) {
            final int defaultRadius = 10;
            final String defaultColor = Color.WHITE.name();
            defaultFigure = new Circle(defaultColor, defaultRadius);
        }
        return defaultFigure;
    }
}
