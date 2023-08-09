package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 15;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(),DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);
        String newColor = colorSupplier.getRandomColor();
        int newNumber = random.nextInt(MAX_NUMBER);
        switch (randomFigureNumber) {
            case (0): return new Rectangle(newColor, newNumber,newNumber);
            case (1): return new Square(newColor,newNumber);
            case (2): return new RightTriangle(newColor,newNumber,newNumber);
            case (3): return new Circle(newColor, newNumber);
            case (4): return new IsoscelesTrapezoid(newColor,newNumber,newNumber,newNumber);
            default: return getDefaultFigure();
        }
    }
}
