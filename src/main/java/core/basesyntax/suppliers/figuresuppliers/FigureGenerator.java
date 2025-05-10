package core.basesyntax.suppliers.figuresuppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.suppliers.colorsuppliers.ColorSupplier;
import java.util.Random;

public class FigureGenerator {
    private static final int MIN_SIDE_LENGTH = 5;
    private static final int MAX_SIDE_LENGTH = 25;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getCircle() {
        int[] parameters = generateParameters(1);
        return new Circle(getRandomColor(),
                parameters[0]);
    }

    public Figure getSquare() {
        int[] parameters = generateParameters(1);
        return new Square(getRandomColor(),
                parameters[0]);
    }

    public Figure getRectangle() {
        int[] parameters = generateParameters(2);
        return new Rectangle(getRandomColor(),
                parameters[0],
                parameters[1]);
    }

    public Figure getRightTriangle() {
        int[] parameters = generateParameters(2);
        return new RightTriangle(getRandomColor(),
                parameters[0],
                parameters[1]);
    }

    public Figure getIsoscelesTrapezoid() {
        int[] parameters = generateParameters(3);
        return new IsoscelesTrapezoid(getRandomColor(),
                parameters[0],
                parameters[1],
                parameters[2]);
    }

    private int[] generateParameters(int numberOfParameters) {
        int[] parameters = new int[numberOfParameters];
        int first = generateRandomNumber();
        int second = generateRandomNumber();
        while (second > first) {
            second = generateRandomNumber();
        }
        int third = generateRandomNumber();
        if (numberOfParameters == 3) {
            parameters[2] = third;
            parameters[1] = second;
            parameters[0] = first;
        } else if (numberOfParameters == 2) {
            parameters[1] = second;
            parameters[0] = first;
        } else if (numberOfParameters == 1) {
            parameters[0] = first;
        }
        return parameters;
    }

    private int generateRandomNumber() {
        return MIN_SIDE_LENGTH + random.nextInt(MAX_SIDE_LENGTH);
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }
}
