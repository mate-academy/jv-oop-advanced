package core.basesyntax.suppliers.figuresuppliers;

import core.basesyntax.enums.Shape;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.suppliers.colorsuppliers.RandomColorSupplier;
import java.util.Random;

public class RandomFigureSupplier {
    private final int maxSideLength;
    private final int minSideLength;
    private final RandomColorSupplier randomColorSupplier = new RandomColorSupplier();
    private final Random random = new Random();

    public RandomFigureSupplier(int minSideLength, int maxSideLength) {
        this.minSideLength = minSideLength;
        this.maxSideLength = maxSideLength;
    }

    public Figure getRandomFigure(Shape figureType) {
        int[] parameters = generateParameters();
        Figure figure;
        switch (figureType) {
            case CIRCLE: figure = new Circle(getRandomColor(), parameters[0]);
            break;
            case ISOSCELES_TRAPEZOID: figure = new IsoscelesTrapezoid(getRandomColor(),
                    parameters[0],
                    parameters[1],
                    parameters[2]);
            break;
            case RECTANGLE: figure = new Rectangle(getRandomColor(),
                    parameters[0],
                    parameters[1]);
            break;
            case RIGHT_TRIANGLE: figure = new RightTriangle(getRandomColor(),
                    parameters[0],
                    parameters[1]);
            break;
            case SQUARE: figure = new Square(getRandomColor(), parameters[0]);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
        return figure;
    }

    private String getRandomColor() {
        return randomColorSupplier.getRandomColor();
    }

    private int[] generateParameters() {
        int first = generateRandomNumber(minSideLength, maxSideLength);
        int second = generateRandomNumber(minSideLength, maxSideLength);

        while (second > first) {
            second = generateRandomNumber(minSideLength, maxSideLength);
        }

        int third = generateRandomNumber(minSideLength, maxSideLength);

        return new int[]{first, second, third};
    }

    private int generateRandomNumber(int min, int max) {
        return min + random.nextInt(max);
    }
}
