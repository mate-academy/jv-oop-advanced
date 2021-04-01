package core.basesyntax.suppliers;

import core.basesyntax.Circle;
import core.basesyntax.Figure;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_ARRAY_LENGTH = 100;
    public static final double MIN_FIGURE_VALUE = 1;
    public static final double MAX_FIGURE_VALUE = 1000;
    public static final int NUMBER_OF_FIGURES = 5;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure[] generateFigures() {
        Figure[] randomFigures = new Figure[random.nextInt(MAX_ARRAY_LENGTH)];
        for (int i = 0; i < randomFigures.length; i++) {
            switch (random.nextInt(NUMBER_OF_FIGURES)) {
                case 0:
                    randomFigures[i] = getNewRandomSquare();
                    break;
                case 1:
                    randomFigures[i] = getNewRandomRectangle();
                    break;
                case 2:
                    randomFigures[i] = getNewRandomRightTriangle();
                    break;
                case 3:
                    randomFigures[i] = getNewRandomCircle();
                    break;
                default:
                    randomFigures[i] = getNewRandomIsoscelesTrapezoid();
                    break;
            }
        }
        return randomFigures;
    }

    private Square getNewRandomSquare() {
        double length = generateFigureValue();
        return new Square("Square", colorSupplier.generateColor(), length);
    }

    private Figure getNewRandomRightTriangle() {
        double baseLength = generateFigureValue();
        double height = generateFigureValue();
        return new RightTriangle("Right Triangle", colorSupplier.generateColor(),
                baseLength, height);
    }

    private Figure getNewRandomRectangle() {
        double width = generateFigureValue();
        double length = generateFigureValue();
        return new Rectangle("Rectangle", colorSupplier.generateColor(), width, length);
    }

    private Figure getNewRandomIsoscelesTrapezoid() {
        double sideA = generateFigureValue();
        double sideB = generateFigureValue();
        double height = generateFigureValue();
        return new IsoscelesTrapezoid("Isosceles Trapezoid", colorSupplier.generateColor(),
                sideA, sideB, height);
    }

    private Figure getNewRandomCircle() {
        double radius = generateFigureValue();
        return new Circle("Circle", colorSupplier.generateColor(), radius);
    }

    private double generateFigureValue() {
        return MIN_FIGURE_VALUE + (random.nextDouble() * (MAX_FIGURE_VALUE - MIN_FIGURE_VALUE));
    }
}
