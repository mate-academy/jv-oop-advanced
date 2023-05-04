package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Figure circleWhite10 = new Circle(Color.WHITE, 10);
    private final Random randomFigure = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Square square = new Square(colorSupplier.getRandomColor(),
            randomFigure.nextInt(100));
    private final Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
            randomFigure.nextInt(100), randomFigure.nextInt(100));
    private final RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
            randomFigure.nextInt(100), randomFigure.nextInt(100));
    private final Circle circle = new Circle(colorSupplier.getRandomColor(),
            randomFigure.nextInt(100));
    private final IsoscelesTrapezoid isoscelesTrapezoid =
            new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            randomFigure.nextInt(100), randomFigure.nextInt(100),
                    randomFigure.nextInt(100));
    private final Figure[] array = new Figure[]{square, rectangle,
            rightTriangle, circle, isoscelesTrapezoid};

    public Figure getRandomFigure() {
        int index = randomFigure.nextInt(array.length);
        return array[index];
    }

    public Figure getDefaultFigure() {
        return circleWhite10;
    }
}
