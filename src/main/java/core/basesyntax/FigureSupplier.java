package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (getRandomFigureType()) {
            case SQUARE:
                Square square = new Square(randomColor.getRandomColor(),
                        random.nextInt(MAX_VALUE));
                return square;
            case CIRCLE:
                Circle circle = new Circle(randomColor.getRandomColor(),
                        random.nextInt(MAX_VALUE));
                return circle;
            case ISOSCELESTRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid =
                        new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                                random.nextInt(MAX_VALUE));
                return isoscelesTrapezoid;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle(randomColor.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                return rectangle;
            case RIGHTTRIANGLE:
                RightTriangle rightTriangle = new RightTriangle(randomColor.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                return rightTriangle;
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private FigureType getRandomFigureType() {
        int index = random.nextInt(FigureType.values().length);
        return FigureType.values()[index];
    }
}
