package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH_OF_SEGMENT = 20;
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        final Random random = new Random();
        final int figureNumber = random.nextInt(FIGURE_COUNT);
        final ColorSupplier colorSupplier = new ColorSupplier();
        final Figure circle = new Circle(colorSupplier.getRandomColor(),
                random.nextDouble());
        final Figure square = new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH_OF_SEGMENT));
        final Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH_OF_SEGMENT), random.nextInt(MAX_LENGTH_OF_SEGMENT));
        final Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(), random.nextDouble());
        final Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(), random.nextDouble(), random.nextInt(MAX_LENGTH_OF_SEGMENT));
        switch (figureNumber) {
            case 0:
                circle.draw();
                break;
            case 1:
                square.draw();
                break;
            case 2:
                rectangle.draw();
                break;
            case 3:
                rightTriangle.draw();
                break;
            case 4:
                isoscelesTrapezoid.draw();
                break;
            default:
                break;
        }
        return new Figure(colorSupplier.getRandomColor()) {
            @Override
            public double getArea() {
                return 0;
            }
        };
    }

    public Figure getDefaultFigure() {
        new Circle(Color.WHITE.toString(), DEFAULT_RADIUS).draw();
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }
}
