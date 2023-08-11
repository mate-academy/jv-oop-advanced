package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 50;
    public static final int TYPES_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(TYPES_OF_FIGURES)) {
            case 0: return new Circle(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE));
            case 1: return new RightTriangle(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE),random.nextInt(MAX_VALUE));
            case 2: return new Rectangle(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE),random.nextInt(MAX_VALUE));
            case 3: return new Square(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE));
            case 4: return new IsoscelesTrapezoid(colorSupplier.getRandomColor().name(),
                    random.nextInt(MAX_VALUE),random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE));
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle("White", 10);
        return circle;
    }
}
