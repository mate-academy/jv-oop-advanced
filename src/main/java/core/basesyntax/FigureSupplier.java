package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(random.nextDouble() * 10 + 1, "green");
            case 1:
                return new Rectangle(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, "red");
            case 2:
                return new RightTriangle(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, "purple");
            case 3:
                return new Circle(random.nextDouble() * 10 + 1, "orange");
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, "pink");
            default:
                return null;
        }
    }
}
