package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Figure circleWhite10 = new Circle(Color.WHITE, 10);
    private final Random randomFigure = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Square square = new Square(colorSupplier.getRandomColor(), randomFigure.nextInt(100));
    private Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(), randomFigure.nextInt(100), randomFigure.nextInt(100));
    private RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), randomFigure.nextInt(100), randomFigure.nextInt(100));
    private Circle circle = new Circle(colorSupplier.getRandomColor(), randomFigure.nextInt(100));
    private IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomFigure.nextInt(100), randomFigure.nextInt(100), randomFigure.nextInt(100));
    private Figure[] array = new Figure[]{square, rectangle, rightTriangle, circle, isoscelesTrapezoid};

    public Figure getRandomFigure() {
        int index = randomFigure.nextInt(array.length);
        return array[index];
    }

    public Figure getDefaultFigure() {
        return circleWhite10;
    }
}
