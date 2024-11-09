package core.basesyntax;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private final List<FigureType> availableFigures = Arrays.asList(FigureType.values());
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomFigure(boolean randomParameters) {
        int figuresSize = availableFigures.size();
        int randomIndex = random.nextInt(figuresSize - 1);

        FigureType randomFigure = availableFigures.get(randomIndex);
        Color randomColor = color.getRandomColor();

        switch(randomFigure) {
            case CIRCLE: return new Circle(random.nextInt(10), randomColor);
            case SQUARE: return new Square(random.nextInt(10), randomColor);
            case RECTANGLE: return new Rectangle(random.nextInt(10), random.nextInt(10), randomColor);
            case RIGHT_RECTANGLE: return new RightTriangle(random.nextInt(10), random.nextInt(10), randomColor);
            case ISOSCELES_TRAPEZOID: return new IsoscelesTrapezoid(random.nextInt(10), random.nextInt(10), random.nextInt(10), randomColor);
            default: return getDefaultFigure();
        }
    }
}
