package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Figure defaultFigure = new Circle(Color.WHITE, 10);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private enum Figures {
        CIRCLE, RECTANGLE, SQUARE, RIGHT_TRIANGLE, ISOSCELES_TRAPEZOID
    }

    private final Figures[] figures = Figures.values();

    public Figure getRandomFigure() {
        Figure figure = defaultFigure;
        switch (figures[random.nextInt(figures.length)]) {
            case CIRCLE:
                figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(101));
                break;
            case RECTANGLE:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(101), random.nextInt(101));
                break;
            case SQUARE:
                new Square(colorSupplier.getRandomColor(), random.nextInt(101));
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(101), random.nextInt(101));
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(101), random.nextInt(101),
                        random.nextInt(101));
                break;
            default: break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
