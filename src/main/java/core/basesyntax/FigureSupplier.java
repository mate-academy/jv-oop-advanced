package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final double MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(5)) {
            case 0:
                return new Square(color, random.nextInt((int) MAX_SIZE) + 1);
            case 1:
                return new Rectangle(color, random.nextInt((int) MAX_SIZE) + 1,
                        random.nextInt((int) MAX_SIZE) + 1);
            case 2:
                return new RightTriangle(color, random.nextInt((int) MAX_SIZE) + 1,
                        random.nextInt((int) MAX_SIZE) + 1);
            case 3:
                return new Circle(color, random.nextInt((int) MAX_SIZE) + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt((int) MAX_SIZE) + 1,
                        random.nextInt((int) MAX_SIZE) + 1, random.nextInt((int) MAX_SIZE) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", MAX_SIZE);
    }
}
