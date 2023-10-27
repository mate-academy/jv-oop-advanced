package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random random;
    private final double defaultRadius = 10;
    private final String defaultColor = Color.WHITE.name();
    private final Figure defaultFigure = new Circle(defaultColor, defaultRadius);

    public FigureSupplier() {
        // Should I pass this random object to color supplier constructor, or it is bad practice ?
        // And is it better to create another random class in color supplier ?
        this.random = new Random();
        this.colorSupplier = new ColorSupplier(random);
    }

    public Figure getRandomFigure() {
        int maxLengthInUnits = 100;
        double firstValue = random.nextDouble() * maxLengthInUnits;
        double secondValue = random.nextDouble() * maxLengthInUnits;
        double thirdValue = random.nextDouble() * maxLengthInUnits;

        int figuresTypesNumber = 5;
        int randomChoice = random.nextInt(figuresTypesNumber);
        String randomColor = colorSupplier.getRandomColor();

        // I can create random object of four propositions using switch or using array
        // But array uses too much time to create and memory
        // Enhanced switch to optimize the code
        return switch (randomChoice) {
            case 0 -> new Circle(randomColor, firstValue);
            case 1 -> new Square(randomColor, firstValue);
            case 2 -> new Rectangle(randomColor, firstValue, secondValue);
            case 3 -> new RightTriangle(randomColor, firstValue, secondValue);
            case 4 -> new IsoscelesTrapezoid(randomColor, firstValue, secondValue, thirdValue);
            default -> {
                assert false : "Default case should not be reached.";
                yield null;
            }
        };
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
