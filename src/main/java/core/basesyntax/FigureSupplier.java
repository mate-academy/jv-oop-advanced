package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Color DEFAULT_COLOR = Color.WHITE;

    public Figure getRandomFigure() {
        Figure[] randomFigures = new Figure[] {
                new Circle(),
                new Square(),
                new IsoscelesTrapezoid(),
                new RightTriangle(),
                new Rectangle()
        };

        final int randomIndex = random.nextInt(randomFigures.length);
        Figure figures = randomFigures[randomIndex];

        if (figures instanceof Circle circle) {
            circle.setRadius(random.nextDouble());
            circle.setColor(colorSupplier.getRandomColor());
        }
        if (figures instanceof Square square) {
            square.setSide(random.nextDouble());
            square.setColor(colorSupplier.getRandomColor());
        }
        if (figures instanceof IsoscelesTrapezoid isoscelesTrapezoid) {
            isoscelesTrapezoid.setHeight(random.nextDouble());
            isoscelesTrapezoid.setSideA(random.nextDouble());
            isoscelesTrapezoid.setSideB(random.nextDouble());
            isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        }
        if (figures instanceof RightTriangle rightTriangle) {
            rightTriangle.setHeight(random.nextDouble());
            rightTriangle.setBase(random.nextDouble());
            rightTriangle.setColor(colorSupplier.getRandomColor());
        }
        if (figures instanceof Rectangle rectangle) {
            rectangle.setLength(random.nextDouble());
            rectangle.setWidth(random.nextDouble());
            rectangle.setColor(colorSupplier.getRandomColor());
        }
        return figures;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR.name());
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
