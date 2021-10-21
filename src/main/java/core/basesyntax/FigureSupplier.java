package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM = 50;
    private static final int FIGURES_COUNT = 5;
    private Random random = new Random();
    
    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor().toString();
        int figure = random.nextInt(FIGURES_COUNT);
        switch (figure) {
            case 0:
                return new Circle(random.nextInt(MAX_RANDOM), color);
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM),
                random.nextInt(MAX_RANDOM), random.nextInt(MAX_RANDOM), color);
            case 2:
                return new Rectangle(random.nextInt(MAX_RANDOM),
                random.nextInt(MAX_RANDOM), color);
            case 3:
                return new RightTriangle(random.nextInt(MAX_RANDOM),
                random.nextInt(MAX_RANDOM), color);
            default:
                return new Square(random.nextInt(MAX_RANDOM), color);
        }
    }
    
    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
