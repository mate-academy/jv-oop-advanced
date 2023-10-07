package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(5);

        switch (randomFigure) {
            case 0:
                return new Circle(figureColor, random.nextDouble() * 9.0 + 1.0);
            case 1:
                return new IsoscelesTrapezoid(figureColor, random.nextDouble() * 9.0 + 1.0,
                        random.nextDouble() * 9.0 + 1.0, random.nextDouble() * 9.0 + 1.0);
            case 2:
                return new Rectangle(figureColor, random.nextDouble() * 9.0 + 1.0,
                        random.nextDouble() * 9.0 + 1.0);
            case 3:
                return new RightTriangle(figureColor, random.nextDouble() * 9.0 + 1.0,
                        random.nextDouble() * 9.0 + 1.0);
            case 4:
                return new Square(figureColor, random.nextDouble() * 9.0 + 1.0);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
