package core.basesyntax.figure;

import java.awt.*;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final Random RANDOM = new Random();
    private static final String DEF_CIRCLE_COLOR = Color.WHITE.name();
    private static final int DEF_CIRCLE_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(color,
                        getRandomSide());
            case 1:
                return new Rectangle(color,
                        getRandomSide(),
                        getRandomSide());
            case 2:
                return new RightTriangle(color,
                        getRandomSide(),
                        getRandomSide());
            case 3:
                return new Circle(color,
                        getRandomSide());
            case 4:
                return new IsoscelesTrapezoid(color,
                        getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
            default:
                return getDefaultFigure();
        }
    }

    public double getRandomSide() {
        return RANDOM.nextDouble(MAX_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEF_CIRCLE_COLOR, DEF_CIRCLE_RADIUS);
    }
}

