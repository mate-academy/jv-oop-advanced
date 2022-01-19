package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 4;
    private static final int DEFAULT_VALUE = 10;
    private static final int MAX_VALUE = 20;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(FIGURES_NUMBER + 1)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_VALUE);
    }
}
