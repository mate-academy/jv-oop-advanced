package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBERS_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(NUMBERS_OF_FIGURES);
        switch (type) {
            case 0 :
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(), random.nextDouble());
            case 1 :
                return new Square(colorSupplier.getRandomColor(),random.nextDouble());
            case 2 :
                return new RightTriangle(colorSupplier.getRandomColor(),random.nextDouble(), random.nextDouble());
            case 3 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(), random.nextDouble());
            case 4 :
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", random.nextDouble());
    }
}
