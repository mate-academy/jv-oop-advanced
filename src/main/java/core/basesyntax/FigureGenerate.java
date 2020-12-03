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
        square.setColor(GenerateColor.get());
        return square;
    }

    private Figure getCircle() {
        Figure circle = new Circle(new Random().nextInt(5));
        circle.setColor(GenerateColor.get());
        ;
        return circle;
    }

    private Figure getRectangle() {
        Figure rectangle = new Rectangle(new Random().nextInt(10), new Random().nextInt(15));
        rectangle.setColor(GenerateColor.get());
        return rectangle;
    }

    private Figure getRightTriangle() {
        Figure rightTriangle = new RightTriangle(new Random().nextInt(10),
                new Random().nextInt(10));
        rightTriangle.setColor(GenerateColor.get());
        return rightTriangle;
    }

    private Figure getIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(new Random().nextInt(5),
                new Random().nextInt(15));
        isoscelesTrapezoid.setColor(GenerateColor.get());
        return isoscelesTrapezoid;
    }

}
