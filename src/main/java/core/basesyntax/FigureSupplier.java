package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 11;
    private static final int MAX_BOUND = 5;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random random = new Random();
    private String defaultWhite = Color.WHITE.name();
    private int defaultRadius = 10;

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_BOUND);
        switch (index) {
            case 0:
                return new Square(randomColor.getRandomColor(),
                    (double) random.nextInt(MAX_VALUE));
            case 1:
                return new Circle(randomColor.getRandomColor(),
                    (double) random.nextInt(MAX_VALUE));
            case 2:
                return new Rectangle(randomColor.getRandomColor(),
                    (double) random.nextInt(MAX_VALUE), (double) random.nextInt(MAX_VALUE));
            case 3:
                return new RightTriangle(randomColor.getRandomColor(),
                    (double) random.nextInt(MAX_VALUE), (double) random.nextInt(MAX_VALUE));
            case 4:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                    (double) random.nextInt(MAX_VALUE), (double) random.nextInt(MAX_VALUE),
                    (double) random.nextInt(MAX_VALUE));
            default:
                throw new IllegalStateException("such index does not exist");

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultWhite, defaultRadius);
    }

}
