package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUM_FIGURE = 5;
    private static final int MAX_LENGTH_SIDE = 1000;
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public Figure getRandomFigure() {
        int getNumFigure = random.nextInt(NUM_FIGURE);
        switch (getNumFigure) {
            case 0:
                return new Square(random.nextInt(MAX_LENGTH_SIDE),
                        colorSupplier.getRandomColor(),"Square");
            case 1:
                return new Circle(random.nextInt(MAX_LENGTH_SIDE),
                        colorSupplier.getRandomColor(), "Circle");
            case 2:
                return new Rectangle(random.nextInt(MAX_LENGTH_SIDE),
                        random.nextInt(MAX_LENGTH_SIDE),
                        colorSupplier.getRandomColor(), "Rectangle");
            case 3:
                return new RightTriangle(random.nextInt(MAX_LENGTH_SIDE),
                        random.nextInt(MAX_LENGTH_SIDE),
                        colorSupplier.getRandomColor(), "Right Triangle");
            default:
                return new IsoscelesTrapezoid(random.nextInt(MAX_LENGTH_SIDE),
                        random.nextInt(MAX_LENGTH_SIDE),
                        random.nextInt(MAX_LENGTH_SIDE), colorSupplier.getRandomColor(),
                        "Isosceles Trapezoid");
        }
    }
}
