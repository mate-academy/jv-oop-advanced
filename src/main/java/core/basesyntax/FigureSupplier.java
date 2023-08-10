package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private int maxLength = 50;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(4)) {
            case 0: return new Circle((colorSupplier.getRandomColor()).name(),
                    random.nextInt(maxLength));
            case 1: return new RightTriangle((colorSupplier.getRandomColor()).name(),
                    random.nextInt(maxLength),random.nextInt(maxLength));
            case 2: return new Rectangle((colorSupplier.getRandomColor()).name(),
                    random.nextInt(maxLength),random.nextInt(maxLength));
            case 3: return new Square((colorSupplier.getRandomColor()).name(),
                    random.nextInt(maxLength));
            case 4: return new IsoscelesTrapezoid((colorSupplier.getRandomColor()).name(),
                    random.nextInt(maxLength),random.nextInt(maxLength),
                    random.nextInt(maxLength));
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle("White", 10);
        return circle;
    }
}
