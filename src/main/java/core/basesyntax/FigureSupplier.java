package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int figuresAmount = 5;

    public Figure getRandomFigure() {
        switch (random.nextInt(figuresAmount)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(50));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50),random.nextInt(50));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(50));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
