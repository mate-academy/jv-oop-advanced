package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = ThreadLocalRandom.current().nextInt(5);  // 5 типов фигур
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double side = 1 + ThreadLocalRandom.current().nextDouble(10);
                return new Square(color, side);
            case 1:
                double firstLeg = 1 + ThreadLocalRandom.current().nextDouble(10);
                double secondLeg = 1 + ThreadLocalRandom.current().nextDouble(10);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 2:
                double radius = 1 + ThreadLocalRandom.current().nextDouble(10);
                return new Circle(color, radius);
            case 3:
                double width = 1 + ThreadLocalRandom.current().nextDouble(10);
                double height = 1 + ThreadLocalRandom.current().nextDouble(10);
                return new Rectangle(color, width, height);
            case 4:
                double base1 = 1 + ThreadLocalRandom.current().nextDouble(10);
                double base2 = 1 + ThreadLocalRandom.current().nextDouble(10);
                double leg = 1 + ThreadLocalRandom.current().nextDouble(10);
                return new IsoscelesTrapezoid(color, base1, base2, leg);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}