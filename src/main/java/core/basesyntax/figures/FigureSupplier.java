package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int maxNumber = 30;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureName.values().length);
        if (index == 1) {
            return new Square(colorSupplier.getRandomColor(), random.nextInt(maxNumber));
        }
        if (index == 2) {
            return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(maxNumber),
                    random.nextInt(maxNumber));
        }
        if (index == 3) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(maxNumber), random.nextInt(maxNumber));
        }
        if (index == 4) {
            return new Circle(colorSupplier.getRandomColor(), random.nextInt(maxNumber));
        } else {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(maxNumber), random.nextInt(maxNumber),
                    random.nextInt(maxNumber));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
