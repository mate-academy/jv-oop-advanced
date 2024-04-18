package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int maxSize = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int numFigureTypes = 5;
        int figureType = random.nextInt(numFigureTypes);

        switch (figureType) {
            case 0:
                return new Square(random.nextDouble() * maxSize,color);
            case 1:
                return new Rectangle( random.nextDouble() * maxSize, random.nextDouble() * maxSize, color);
            case 2:
                return new RightTriangle(random.nextDouble() * maxSize, random.nextDouble() * maxSize, color);
            case 3:
                return new Circle(random.nextDouble() * maxSize, color);
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * maxSize, random.nextDouble() * maxSize, random.nextDouble() * maxSize, color);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(maxSize, Color.WHITE);
    }
}
