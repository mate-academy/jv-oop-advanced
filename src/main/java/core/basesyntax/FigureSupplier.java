package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int MIN_VALUE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType[] figureTypes = FigureType.values();
        FigureType figureType = figureTypes[random.nextInt(FigureType.values().length)];
        Figure resultFigure = null;

        if (figureType.equals(FigureType.RECTANGLE)) {
            String color = colorSupplier.getRandomColor();
            int sideA = random.nextInt(MAX_VALUE);
            int sideB = random.nextInt(MAX_VALUE);
            int sideC = sideA;
            int sideD = sideB;
            resultFigure = new Rectangle(sideA, sideB, sideC, sideD, color);
        }

        if (figureType.equals(FigureType.ISOSCELESTRAPEZOID)) {
            String color = colorSupplier.getRandomColor();
            int sideA = random.nextInt(MAX_VALUE);
            int sideC = random.nextInt(MIN_VALUE);
            int sideD = random.nextInt(MIN_VALUE) + MAX_VALUE;
            int sideB = sideA;

            resultFigure = new IsoscelesTrapezoid(sideA, sideB, sideC, sideD, color);
        }

        if (figureType.equals(FigureType.SQUARE)) {
            int sideA;
            int sideB;
            int sideC;
            int sideD;
            String color = colorSupplier.getRandomColor();
            sideA = sideB = sideC = sideD = random.nextInt(MAX_VALUE);
            resultFigure = new Square(sideA, sideB, sideC, sideD, color);
        }

        if (figureType.equals(FigureType.RIGHTTRIANGLE)) {
            int sideA;
            int sideB;
            int sideC;
            String color = colorSupplier.getRandomColor();

            sideA = sideB = random.nextInt(MAX_VALUE);
            sideC = sideA * sideB;

            resultFigure = new RightTriangle(sideA, sideB, sideC, color);
        }

        if (figureType.equals(FigureType.CIRCLE)) {
            int radius = random.nextInt(MAX_VALUE);
            String color = colorSupplier.getRandomColor();

            resultFigure = new Circle(radius, color);
        }
        return resultFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(MIN_VALUE, "WHITE");
    }
}
