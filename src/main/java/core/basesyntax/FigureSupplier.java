package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String[] FIGURES = new String[]
            {"Square", "Rectangle", "Circle", "Right Triangle", "Isosceles Trapezoid"};
    private static final int MAXIMUM_SIDE_SIZE = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber1 = new Random().nextInt(MAXIMUM_SIDE_SIZE) + 1;
        int randomNumber2 = new Random().nextInt(MAXIMUM_SIDE_SIZE) + 1;
        int randomNumber3 = new Random().nextInt(MAXIMUM_SIDE_SIZE) + 1;
        int chooseFigure = new Random().nextInt(FIGURES.length);
        switch (chooseFigure) {
            case 1: Square square = new Square(randomNumber1);
                    square.setColor(colorSupplier.getRandomColor());
                    return square;
            case 2: Rectangle rectangle = new Rectangle(randomNumber1, randomNumber2);
                    rectangle.setColor(colorSupplier.getRandomColor());
                    return rectangle;
            case 3: Circle circle = new Circle(randomNumber1);
                    circle.setColor(colorSupplier.getRandomColor());
                    return circle;
            case 4: RightTriangle rightTriangle = new RightTriangle(randomNumber1, randomNumber2);
                    rightTriangle.setColor(colorSupplier.getRandomColor());
                    return rightTriangle;
            default: IsoscelesTrapezoid isoscelesTrapezoid =
                    new IsoscelesTrapezoid(randomNumber1, randomNumber2, randomNumber3);
                    isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                    return isoscelesTrapezoid;
        }
    }
}
