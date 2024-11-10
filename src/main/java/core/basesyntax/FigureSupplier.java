package core.basesyntax;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private final List<FigureType> availableFigures = Arrays.asList(FigureType.values());
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();
    public static final int DEFAULT_CIRCLE_RADIUS = 10;

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE);
    }

    public Figure getRandomFigure(boolean randomParameters) {
        int figuresMaxIndex = availableFigures.size();
        int randomIndex = random.nextInt(figuresMaxIndex);

        FigureType randomFigure = availableFigures.get(randomIndex);
        Color randomColor = color.getRandomColor();

        switch(randomFigure) {
            case CIRCLE: return new Circle(random.nextInt(10), randomColor);
            case SQUARE: return new Square(random.nextInt(10), randomColor);
            case RECTANGLE: return new Rectangle(random.nextInt(10), random.nextInt(10), randomColor);
            case RIGHT_TRIANGLE: return new RightTriangle(random.nextInt(10), random.nextInt(10), randomColor);
            case ISOSCELES_TRAPEZOID: return new IsoscelesTrapezoid(random.nextInt(10), random.nextInt(10), random.nextInt(10), randomColor);
            default: return getDefaultFigure();
        }
    }
}
