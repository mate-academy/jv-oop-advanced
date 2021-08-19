package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int MIN_SIZE = 1;
    private static final int FIGURES_NUMBER = 4;

    public Figure getRandomFigure() {
        Random random = new Random();
        String color = new ColorSupplier().getRandomColor();
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return new Rectangle(random.nextInt(MAX_SIZE) + MIN_SIZE, random.nextInt(MAX_SIZE)
                        + MIN_SIZE, color);
            case 1:
                return new Circle(random.nextInt(MAX_SIZE) + MIN_SIZE, color);
            case 2:
                return new RightTriangle(random.nextInt(MAX_SIZE) + MIN_SIZE,
                        random.nextInt(MAX_SIZE) + MIN_SIZE, color);
            case 3:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIZE) + MIN_SIZE,
                        random.nextInt(MAX_SIZE) + MIN_SIZE,
                        random.nextInt(MAX_SIZE) + MIN_SIZE, color);
            default:
                return new Square(random.nextInt(MAX_SIZE) + MIN_SIZE, color);
        }
    }
}
