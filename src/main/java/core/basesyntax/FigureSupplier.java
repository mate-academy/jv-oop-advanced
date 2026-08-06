package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {

    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        return switch (index) {
            case 0 -> new Circle(getRandomColor(), random.nextDouble());
            case 1 -> new IsoscelesTrapezoid(getRandomColor(), random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble());
            case 2 -> new Rectangle(getRandomColor(), random.nextDouble(), random.nextDouble());
            case 3 -> new RightTriangle(getRandomColor(), random.nextDouble(),
                        random.nextDouble());

            default -> new Square(getRandomColor(), random.nextDouble());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
