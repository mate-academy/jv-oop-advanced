package core.basesyntax;

import java.util.Random;
import java.util.Scanner;

public class FigureSupplier {
    private static final int MAX_VALUE_FOR_FIGURES = 26;
    private static final int MAX_VALUE_FOR_CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, MAX_VALUE_FOR_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        Scanner in = new Scanner(System.in);
        System.out.println("choose number from 1 to 6: ");
        int number = in.nextInt();
        switch (number) {
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomSquare();
            case 5:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES));

    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES),
                random.nextInt(MAX_VALUE_FOR_FIGURES));

    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES));

    }
}
