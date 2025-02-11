package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case 0: return new Circle(colorSupplier.getRandomColor(), random.nextDouble(20));
            case 1: return new Square(colorSupplier.getRandomColor(), random.nextDouble(20));
            case 2: return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(20),
                    random.nextDouble(20));
            case 3: return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble(20), random.nextDouble(20));
            default: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble(20), random.nextDouble(20), random.nextDouble(20));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(),10);
    }
}
