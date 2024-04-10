package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 100;
    private static final int FIGURE_NUMBER = 5;
    private static final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(MAX_NUMBER);
        int figureType = random.nextInt(FIGURE_NUMBER);

        switch (figureType) {
            case 0:
                return new Circle(color.getRandomColor(), number);
            case 1:
                return new Square(color.getRandomColor(), number);
            case 2:
                int number2 = random.nextInt(MAX_NUMBER);
                return new Rectangle(color.getRandomColor(), number, number2);
            case 3:
                int number3 = random.nextInt(MAX_NUMBER);
                return new RightTriangle(color.getRandomColor(), number, number3);
            case 4:
                int lowBase = random.nextInt(MAX_NUMBER);
                int side = random.nextInt(MAX_NUMBER);
                int height = random.nextInt(MAX_NUMBER);
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        number, lowBase, side, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
