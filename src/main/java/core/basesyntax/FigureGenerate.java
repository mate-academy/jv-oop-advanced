package core.basesyntax;

import java.util.Random;

public class FigureGenerate {
    public static final int COUNT_OF_FIGURES = 5;

    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(COUNT_OF_FIGURES);
        switch (randomGeneratedIndex) {
            case 0:
                return getSquare();
            case 1:
                return getCircle();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    private Figure getSquare() {
        Figure square = new Square(new Random().nextInt(10));
        doCalculationAndGenerateColor(square);
        return square;
    }

    private Figure getCircle() {
        Figure circle = new Circle(new Random().nextInt(5));
        doCalculationAndGenerateColor(circle);
        return circle;
    }

    private Figure getRectangle() {
        Figure rectangle = new Rectangle(new Random().nextInt(10), new Random().nextInt(15));
        doCalculationAndGenerateColor(rectangle);
        return rectangle;
    }

    private Figure getRightTriangle() {
        Figure rightTriangle = new RightTriangle(new Random().nextInt(10),
                new Random().nextInt(10));
        doCalculationAndGenerateColor(rightTriangle);
        return rightTriangle;
    }

    private Figure getIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(new Random().nextInt(5),
                new Random().nextInt(15));
        doCalculationAndGenerateColor(isoscelesTrapezoid);
        return isoscelesTrapezoid;
    }

    private void doCalculationAndGenerateColor(Figure figure) {
        figure.doAllCalculations();
        figure.generateColor();
    }

}
