package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int MAX_RANDOM_VALUE = 100;
    private Random random = new Random();
    private int numOfFigure;
    private String color;
    private ColorSupplier colorSupplier;

    public Figure getRandomFigure() {
        Figure figure;
        numOfFigure = random.nextInt(AMOUNT_OF_FIGURES);
        colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        switch (numOfFigure) {
            case 0:
                figure = new Rectangle("Rectangle", color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            case 1:
                figure = new Circle("Circle", color, random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            case 2:
                figure = new IsoscelesTrapezoid("Isosceles Trapezoid",
                        color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            case 3:
                figure = new Square("Square", color, random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            default:
                figure = new RightTriangle("Right Triangle", color,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        int radius = 10;
        Circle circle = new Circle("Circle", Color.WHITE.name(), radius);
        return circle;
    }
}
