package core.basesyntax.figures;

import core.basesyntax.color.ColorSuplier;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int figures = 5;
    private final int maxSize = 99;
    private final String defaultColor = "white";
    private final int defaultRadius = 10;

    public Figure getRandomFigure() {
        return getFigure();
    }

    private Figure getFigure() {
        final int figures = 5;
        final int maxSize = 99;
        ColorSuplier colorSuplier = new ColorSuplier();
        int numberFigure = random.nextInt(figures);
        String color = colorSuplier.getRandomColor();
        switch (numberFigure) {
            case 1:
                return getRandomCircle(maxSize, color);

            case 2:
                int side = random.nextInt(maxSize) + 1;
                return new Square(color, side);

            case 3:
                int firstLeg = random.nextInt(maxSize) + 1;
                int secondLeg = random.nextInt(maxSize) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);

            case 4:
                int top = random.nextInt(maxSize) + 1;
                int down = random.nextInt(maxSize) + 1;
                int altitude = random.nextInt(maxSize) + 1;
                return new IsoscelesTrapezoid(color, top, down, altitude);

            default:
                return new Circle(color, random.nextInt(maxSize));
        }
    }

    private Circle getRandomCircle(int size, String color) {
        int radius = random.nextInt(size) + 1;
        return new Circle(color, radius);
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
