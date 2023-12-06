package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String WHITE = "WHITE";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(4);
        switch (randomNumber) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt());
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, 10);
    }
}
