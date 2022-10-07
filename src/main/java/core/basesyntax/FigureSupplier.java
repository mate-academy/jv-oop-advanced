package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 7;
    private static final int VALUE_OF_CIRCLE = 10;
    private static final String COLOR_OF_CIRCLE = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        Figure[] allFigure = {getRectangle(), getRightTriangle(), getSquare(),
                getIsoscelesTrapezoid(), getDefaultFigure()};
        Figure figure = null;
        for (int i = 0; i < allFigure.length; i++) {
            int rnd = (int) Math.floor(Math.random() * allFigure.length);
            return figure = allFigure[rnd];
        }
        return figure;
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_OF_CIRCLE, VALUE_OF_CIRCLE);
    }
}

