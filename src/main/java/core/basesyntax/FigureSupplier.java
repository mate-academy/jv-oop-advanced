package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int NUMBER_OF_FIGURES = 5;
    static final int MAX_SIZE = 10;
    static final int DEFAULT_VALUE = 10;
    public Figure getRandomFigure() {
        Random random = new Random();
        int values = random.nextInt(NUMBER_OF_FIGURES);
        switch (values) {
            case 0:
                return new Square(new ColorSupplier().getRandomColor(), random.nextInt(MAX_SIZE));
            case 1:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 2:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 3:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            default:
                return new Circle(new ColorSupplier().getRandomColor(), random.nextInt(MAX_SIZE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE), DEFAULT_VALUE);
    }
}
