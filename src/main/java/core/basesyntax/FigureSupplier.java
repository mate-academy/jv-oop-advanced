package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final Random random = new Random();
    private static final int MAX_NUMBER = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String figureColor = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(figureColor, random.nextInt(MAX_NUMBER) + 1);
            case 1:
                return new Rectangle(figureColor, random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1);
            case 2:
                return new RightTriangle(figureColor, random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1);
            case 3:
                return new Circle(figureColor, random.nextInt(MAX_NUMBER) + 1);
            case 4:
                return new IsoscelesTrapezoid(figureColor, random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1, random.nextInt(MAX_NUMBER) + 1);
            default:
                return new IsoscelesTrapezoid(figureColor, random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1, random.nextInt(MAX_NUMBER) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", MAX_NUMBER);
    }
}
