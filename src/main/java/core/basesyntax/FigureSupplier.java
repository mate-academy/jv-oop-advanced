package core.basesyntax;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_RANDOM_INTEGER = 10;
    private final List<FigureType> availableFigures = Arrays.asList(FigureType.values());
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE);
    }

    public Figure getRandomFigure() {
        int figuresMaxIndex = availableFigures.size();
        int randomIndex = random.nextInt(figuresMaxIndex);

        FigureType randomFigure = availableFigures.get(randomIndex);
        Color randomColor = color.getRandomColor();

        switch (randomFigure) {
            case CIRCLE: return new Circle(
                    random.nextInt(MAX_RANDOM_INTEGER),
                    randomColor
            );
            case SQUARE: return new Square(
                    random.nextInt(MAX_RANDOM_INTEGER),
                    randomColor
            );
            case RECTANGLE: return new Rectangle(
                    random.nextInt(MAX_RANDOM_INTEGER),
                    random.nextInt(MAX_RANDOM_INTEGER),
                    randomColor
            );
            case RIGHT_TRIANGLE: return new RightTriangle(
                    random.nextInt(MAX_RANDOM_INTEGER),
                    random.nextInt(MAX_RANDOM_INTEGER),
                    randomColor
            );
            case ISOSCELES_TRAPEZOID: return new IsoscelesTrapezoid(
                    random.nextInt(MAX_RANDOM_INTEGER),
                    random.nextInt(MAX_RANDOM_INTEGER),
                    random.nextInt(MAX_RANDOM_INTEGER),
                    randomColor
            );
            default: return getDefaultFigure();
        }

    }
}
