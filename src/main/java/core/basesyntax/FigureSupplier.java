package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 1:
                return new Circle(random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }
}
