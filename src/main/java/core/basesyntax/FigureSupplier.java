package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(random),
                        random.nextInt(100));
            case 2:
                return new Square(colorSupplier.getRandomColor(random),
                        random.nextInt(100));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(random),
                        random.nextInt(100), random.nextInt(100));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(random),
                        random.nextInt(100), random.nextInt(100));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(random),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100));

        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
