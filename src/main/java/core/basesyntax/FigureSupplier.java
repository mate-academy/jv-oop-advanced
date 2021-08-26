package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        // generate a specific figure based on the `figureNumber` value
        switch (figureNumber) {
            case 1:
                return new Square(colorSupplier.getIndexOfColor(), random.nextInt(100));
            case 2:
                return new Circle(colorSupplier.getIndexOfColor(), random.nextInt(100));
            case 3:
                return new Rectangle(colorSupplier.getIndexOfColor(),
                        random.nextInt(100), random.nextInt(100));
            case 4:
                return new RightTriangle(colorSupplier.getIndexOfColor(),
                        random.nextInt(100), random.nextInt(100));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getIndexOfColor(),
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100));
        }
    }

}
