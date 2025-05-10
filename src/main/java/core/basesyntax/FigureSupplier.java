package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return switch (figureNumber) {
            case 0 -> circle();
            case 1 -> isoscelesTrapezoid();
            case 2 -> rectangle();
            case 3 -> rightTriangle();
            default -> square();
        };
    }

    private Figure circle() {
        Circle circle = new Circle(randomValue());
        circle.setName(FigureName.CIRCLE.name().toLowerCase());
        circle.setColor(randomColor());
        return circle;
    }

    private Figure isoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                randomValue(), randomValue(), randomValue()
        );
        isoscelesTrapezoid.setName(
                FigureName.ISOSCELES_TRAPEZOID.name().toLowerCase().replace('_', ' ')
        );
        isoscelesTrapezoid.setColor(randomColor());
        return isoscelesTrapezoid;
    }

    private Figure rectangle() {
        Rectangle rectangle = new Rectangle(randomValue(), randomValue());
        rectangle.setName(FigureName.RECTANGLE.name().toLowerCase());
        rectangle.setColor(randomColor());
        return rectangle;
    }

    private Figure rightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(randomValue(), randomValue());
        rightTriangle.setName(FigureName.RIGHT_TRIANGLE.name().toLowerCase().replace('_', ' '));
        rightTriangle.setColor(randomColor());
        return rightTriangle;
    }

    private Figure square() {
        Square square = new Square(randomValue());
        square.setName(FigureName.SQUARE.name().toLowerCase());
        square.setColor(randomColor());
        return square;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(MAX_LENGTH);
        circle.setName(FigureName.CIRCLE.name().toLowerCase());
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }

    private int randomValue() {
        return random.nextInt(MIN_LENGTH, MAX_LENGTH);
    }

    private String randomColor() {
        return colorSupplier.getRandomColor();
    }
}
