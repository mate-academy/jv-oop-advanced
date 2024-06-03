package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Circle(color, random.nextDouble() * 10);
            case 1:
                return new Square(color, random.nextDouble() * 10);
            case 2:
                return new Rectangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 3:
                return new RightTriangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10, 
                        random.nextDouble() * 10, random.nextDouble() * 10);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
