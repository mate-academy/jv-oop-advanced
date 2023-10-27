package core.basesyntax;

import core.basesyntax.figures.*;

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
        double firstRandomValue = random.nextDouble()* maxLengthInUnits;
        double secondRandomValue = random.nextDouble()* maxLengthInUnits;
        double thirdRandomValue = random.nextDouble()* maxLengthInUnits;

        int figuresTypesNumber = 5;
        int randomChoice = random.nextInt(figuresTypesNumber);
        String randomColor = colorSupplier.getRandomColor();

        // I can create random object of four propositions using switch or using array
        // But array uses too much time to create and memory
        // Enhanced switch to optimize the code
        return switch (randomChoice) {
            case 0 -> new Circle(randomColor, firstRandomValue);
            case 1 -> new Square(randomColor, firstRandomValue);
            case 2 -> new Rectangle(randomColor, firstRandomValue, secondRandomValue);
            case 3 -> new RightTriangle(randomColor, firstRandomValue, secondRandomValue);
            case 4 -> new IsoscelesTrapezoid(randomColor, firstRandomValue, secondRandomValue, thirdRandomValue);
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
