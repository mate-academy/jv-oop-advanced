package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(40) + 10);
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(40) + 10);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(40) + 10, random.nextInt(40) + 10);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(40) + 10,
                        random.nextInt(40) + 10, random.nextInt(40) + 10);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(40) + 10,
                        random.nextInt(40) + 10, random.nextInt(40) + 10);
            default:
                throw new RuntimeException("Figure type mismatch!");
        }
    }

    public  Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
