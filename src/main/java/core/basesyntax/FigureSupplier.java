package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 7;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(int value) {
        int rndInt = random.nextInt(MAX_VALUE);

        switch (value) {
            case 1:
                return new Circle (colorSupplier.getRandomColor(), random.nextInt(rndInt));
            case 2:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(rndInt));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(rndInt), random.nextInt(rndInt));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(rndInt), random.nextInt(rndInt));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(rndInt), random.nextInt(rndInt));
        }
    }

    public Figure getDefaultFigure() {

        return getRandomFigure(1);
    }
}

