package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "White";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return createRandomFigure(Types.values()[random.nextInt(Types.values().length)]);
    }

    public Figure createRandomFigure(Types types) {
        Figure figure = null;
        switch (types) {
            case Circle :
                figure = new Circle(random.nextInt());
                break;
            case Square:
                figure = new Square(random.nextInt());
                break;
            case Rectangle:
                figure = new Rectangle(random.nextInt(), random.nextInt());
                break;
            case RightTriangle:
                figure = new RightTriangle(random.nextInt(), random.nextInt());
                break;
            case IsoscelesTrapezoid:
                figure = new IsoscelesTrapezoid(random.nextInt(),
                        random.nextInt(), random.nextInt());
                break;
            default:getDefaultFigure();
        }
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(DEFAULT_CIRCLE_RADIUS);
        figure.setColor(DEFAULT_CIRCLE_COLOR);
        return figure;
    }
}
