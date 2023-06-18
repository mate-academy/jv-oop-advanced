package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Shape randomShape = Shape.values()[random.nextInt(Shape.values().length)];
        Color randomColor = Color.valueOf(colorSupplier.getRandomColor());

        switch (randomShape) {
            case CIRCLE:
                return new Circle(randomColor, random.nextInt(Figure.MAX_SIZE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(Figure.MAX_SIZE),
                        random.nextInt(Figure.MAX_SIZE),
                        random.nextInt(Figure.MAX_SIZE));
            case RECTANGLE:
                return new Rectangle(randomColor,
                        random.nextInt(Figure.MAX_SIZE),
                        random.nextInt(Figure.MAX_SIZE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor,
                        random.nextInt(Figure.MAX_SIZE),
                        random.nextInt(Figure.MAX_SIZE));
            case SQUARE:
                return new Square(randomColor,
                        random.nextInt(Figure.MAX_SIZE));
            default:
                System.out.println("Something went wrong!");
                break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
