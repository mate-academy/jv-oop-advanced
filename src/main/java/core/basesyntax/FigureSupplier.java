package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;

    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();

        Circle circle = new Circle(
                "Circle",
                random.nextInt(100),
                supplier.getRandomColor()
        );

        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                "IsoscelesTrapezoid",
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                supplier.getRandomColor()
        );

        Rectangle rectangle = new Rectangle(
                "Rectangle",
                random.nextInt(100),
                random.nextInt(100),
                supplier.getRandomColor()
        );

        RightTriangle rightTriangle = new RightTriangle(
                "RightTriangle",
                random.nextInt(100),
                random.nextInt(100),
                supplier.getRandomColor()
        );

        Square square = new Square(
                "Square",
                random.nextInt(100),
                supplier.getRandomColor()
        );

        int currentRandomFigureIndex = random.nextInt(FIGURE_AMOUNT);
        Figure[] randomFigure = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
        return randomFigure[currentRandomFigureIndex];
    }

    public Circle getDefaultFigure() {
        return new Circle(
                "Circle",
                10,
                "White"
        );
    }
}
