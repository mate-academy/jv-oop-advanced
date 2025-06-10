package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int figureType = random.nextInt(5);

        String randomColor = colorSupplier.getRandomColor();
        double size1 = MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble();
        double size2 = MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble();
        double size3 = MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble();

        switch (figureType) {
            case 0:
                return new Circle(randomColor, size1);
            case 1:
                return new Square(randomColor, size1);
            case 2:
                return new Rectangle(randomColor, size1, size2);
            case 3:
                return new IsoscelesTrapezoid(randomColor, size1, size2, size3);
            case 4:
                return new RightTriangle(randomColor, size1, size2);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10.0);
    }
}
