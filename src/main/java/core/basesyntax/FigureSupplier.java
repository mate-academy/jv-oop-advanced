package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_BORDER = 5;
    private static final int BORDER = 101;
    private int randomFigureIndex;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        randomFigureIndex = random.nextInt(FIGURE_BORDER);
        switch (randomFigureIndex) {
            case 0 :
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(BORDER));
            case 1 :
                return new Square(colorSupplier.getRandomColor(), random.nextInt(BORDER));
            case 2 :
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(BORDER), random.nextInt(BORDER));
            case 3 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(BORDER), random.nextInt(BORDER), random.nextInt(BORDER));
            case 4 :
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(BORDER), random.nextInt(BORDER));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
