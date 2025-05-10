package core.basesyntax;

import java.util.Random;

public class FigureSupplierImplementation implements FigureSupplier {
    private Random random = new Random();

    @Override
    public Figure getRandomFigure() {
        var shape = Shapes.values()[random.nextInt(Shapes.values().length)];
        switch (shape) {
            case RECTANGLE -> {
                return new Rectangle(random.nextDouble(), random.nextDouble());
            }
            case SQUARE -> {
                return new Square(random.nextDouble());
            }
            case CIRCLE -> {
                return new Circle(random.nextDouble());
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(random.nextDouble(), random.nextDouble());
            }
            case ISOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(
                        random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble());
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public Figure getDefaultFigure() {
        var c = new Circle(10.0);
        c.setColor(Colors.WHITE.name());
        return c;
    }
}
