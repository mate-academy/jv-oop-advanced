package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final Random random = new Random();
    private static final double MAX_SIZE = 100.0;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        switch (random.nextInt(5)) {
            case 0:
                return new Square(color, random.nextDouble() * MAX_SIZE);
            case 1:
                return new Rectangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            case 2:
                return new RightTriangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            case 3:
                return new Circle(color, random.nextDouble() * MAX_SIZE);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
