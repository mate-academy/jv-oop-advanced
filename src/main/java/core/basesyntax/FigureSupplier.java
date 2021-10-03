package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String[] FIGURES = new String[]
            {"Square", "Rectangle", "Circle", "Right Triangle", "Isosceles Trapezoid"};
    public static final int MAXIMUM_SIDE_SIZE = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber1 = new Random().nextInt(MAXIMUM_SIDE_SIZE) + 1;
        int randomNumber2 = new Random().nextInt(MAXIMUM_SIDE_SIZE) + 1;
        int randomNumber3 = new Random().nextInt(MAXIMUM_SIDE_SIZE) + 1;
        int chooseFigure = new Random().nextInt(FIGURES.length);
        switch (chooseFigure) {
            case 1: return new Square(randomNumber1, colorSupplier.getRandomColor());
            case 2: return new Rectangle(randomNumber1, randomNumber2,
                    colorSupplier.getRandomColor());
            case 3: return new Circle(randomNumber1, colorSupplier.getRandomColor());
            case 4: return new RightTriangle(randomNumber1, randomNumber2,
                    colorSupplier.getRandomColor());
            default: return new IsoscelesTrapezoid(randomNumber1, randomNumber2, randomNumber3,
                    colorSupplier.getRandomColor());
        }
    }
}
