package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (new Random().nextInt(5)) {
            case 0: return new Square(random.nextDouble(), colorSupplier.getRandomColor());
            case 1: return new Rectangle(random.nextDouble(), random.nextDouble(),
                    colorSupplier.getRandomColor());
            case 2: return new Circle(random.nextDouble(), colorSupplier.getRandomColor());
            case 3: return new RightTriangle(random.nextDouble(), random.nextDouble(),
                    colorSupplier.getRandomColor());
            case 4: return new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                    random.nextDouble(), colorSupplier.getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, ColorSupplier.Color.White.name());
    }
}
