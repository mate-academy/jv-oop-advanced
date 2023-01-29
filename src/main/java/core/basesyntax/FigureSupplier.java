package core.basesyntax;

import java.util.Random;
import java.util.Scanner;

public class FigureSupplier {
    private static final int MAX_VALUE_FOR_FIGURES = 26;
    private static final int MAX_VALUE_FOR_CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

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

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, MAX_VALUE_FOR_CIRCLE_RADIUS);
    }

    public void getRandomFigure() {
        FigureSupplier firstFigure = new FigureSupplier();
        Scanner in = new Scanner(System.in);
        System.out.println("choose number from 1 to 6: ");
        int number = in.nextInt();
        switch (number) {
            case 1:
                firstFigure.getRandomRectangle().draw();
                break;
            case 2:
                firstFigure.getRandomRightTriangle().draw();
                break;
            case 3:
                firstFigure.getRandomCircle().draw();
                break;
            case 4:
                firstFigure.getRandomSquare().draw();
                break;
            case 5:
                firstFigure.getRandomIsoscelesTrapezoid().draw();
                break;
            case 6:
                firstFigure.getDefaultFigure().draw();
                break;
            default:
                System.out.println("this number doesn't exist");
        }
    }
}
