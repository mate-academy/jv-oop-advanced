package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPE_BOUND = 5;
    private final Random random = new Random();
    private final String randomColor = new ColorSupplier().getRandomColor();
    private final int randomFigure = random.nextInt(FIGURE_TYPE_BOUND);

    public Figure getRandomFigure() {
        switch (randomFigure) {
            case 0:
                return new Square(randomColor, random.nextInt(10));
            case 1:
                return new Rectangle(randomColor, random.nextInt(10), random.nextInt(10));
            case 2:
                return new RightTriangle(randomColor, random.nextInt(10), random.nextInt(10));
            case 3:
                return new Circle(randomColor, random.nextInt(10));
            default:
                return new IsoscelesTrapezoid(randomColor, random.nextInt(10),
                        random.nextInt(10), random.nextInt(10));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
