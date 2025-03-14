package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int randomFigure = random.nextInt(5) + 1;

    private int randomSize() {
        return random.nextInt(50) + 1;
    }

    public Figure getRandomFigure() {
        switch (randomFigure) {
            case 1:
                return new Circle(randomSize(), colorSupplier.getRandomColor());
            case 2:
                return new Square(randomSize(), colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(randomSize(), randomSize(), colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(randomSize(), randomSize(), colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(randomSize(), randomSize(), randomSize(), colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
