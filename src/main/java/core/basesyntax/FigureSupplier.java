package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RANDOM_VALUE_BOUND = 16;
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        
        switch (figureNumber) {
            case 1:
                return new Circle(color, getRandomValue());
            case 2:
                return new Rectangle(color, getRandomValue(), getRandomValue());
            case 3:
                return new RightTriangle(color, getRandomValue(), getRandomValue());
            case 4:
                return new IsoscelesTrapezoid(color,
                        getRandomValue(),
                        getRandomValue(),
                        getRandomValue());
            default:
                return new Square(color, getRandomValue());
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
    
    private double getRandomValue() {
        return random.nextInt(1, RANDOM_VALUE_BOUND);
    }
}
