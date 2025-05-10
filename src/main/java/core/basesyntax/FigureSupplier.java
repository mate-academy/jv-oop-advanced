package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int range = 40;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final FigureType[] figureTypes = FigureType.values();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(figureTypes.length);
        FigureType figure = figureTypes[randomFigureIndex];

        if (FigureType.SQUARE.equals(figure)) {
            Figure square = new Square(random.nextInt(range), colorSupplier.getRandomColor());
            return square;
        }
        if (FigureType.RECTANGLE.equals(figure)) {
            Figure rectangle = new Rectangle(random.nextInt(range),
                    random.nextInt(range),
                    colorSupplier.getRandomColor());
            return rectangle;
        }
        if (FigureType.RIGHTTRIANANGLE.equals(figure)) {
            Figure triangle = new RightTriangle(random.nextInt(range),
                    random.nextInt(range),
                    colorSupplier.getRandomColor());
            return triangle;
        }
        if (FigureType.CIRCLE.equals(figure)) {
            Figure circle = new Circle(random.nextInt(range), colorSupplier.getRandomColor());
            return circle;
        }
        if (FigureType.ISOSCELESTRAPEZOID.equals(figure)) {
            Figure trapezoid = new IsoscelesTrapezoid(random.nextInt(range),
                    random.nextInt(range),
                    random.nextInt(range),
                    colorSupplier.getRandomColor());
            return trapezoid;
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10, "white");
        return circle;
    }
}
