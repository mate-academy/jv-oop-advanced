package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_VALUE = 100;
    public static final int NUMBER_FIGURES = 5;

    public Object getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(NUMBER_FIGURES);
        switch (index) {
            case 0:
                return new Square(random.nextInt(MAX_RANDOM_VALUE),
                        new ColorSupplier().getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE), new ColorSupplier().getRandomColor());
            case 2:
                return new Circle(random.nextInt(MAX_RANDOM_VALUE),
                        new ColorSupplier().getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE), new ColorSupplier().getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE), random.nextInt(MAX_RANDOM_VALUE),
                        new ColorSupplier().getRandomColor());
            default:
                return new Circle(random.nextInt(MAX_RANDOM_VALUE),
                        new ColorSupplier().getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
