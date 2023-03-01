package core.basesyntax;

import core.basesyntax.model.*;

import java.util.Random;

public class FigureSupplier {
    private final Figure circle = new Circle(10, Color.WHITE.name());
    private final static int MAX_COUNT_FIGURES = 5;
    private final static int MAX_RANDOM_VALUE = 20;
    private final Random random = new Random();
    private final static  ColorSupplier colorSupplier = new ColorSupplier();
    private final static FigureSupplier figureSupplier = new FigureSupplier();
    private final static Figure[] figures;

    static {
        figures = new Figure[]{new Circle(figureSupplier.getRandomValue(MAX_RANDOM_VALUE), colorSupplier.getRandomColor()),
        new IsoscelesTrapezoid(figureSupplier.getRandomValue(MAX_RANDOM_VALUE), figureSupplier.getRandomValue(MAX_RANDOM_VALUE), figureSupplier.getRandomValue(MAX_RANDOM_VALUE), colorSupplier.getRandomColor()),
        new RightTriangle(figureSupplier.getRandomValue(MAX_RANDOM_VALUE), figureSupplier.getRandomValue(MAX_RANDOM_VALUE), colorSupplier.getRandomColor()),
        new Rectangle(figureSupplier.getRandomValue(MAX_RANDOM_VALUE), figureSupplier.getRandomValue(MAX_RANDOM_VALUE), colorSupplier.getRandomColor()),
        new Square(figureSupplier.getRandomValue(MAX_RANDOM_VALUE), colorSupplier.getRandomColor())};
    }

    public Figure getRandomFigure() {
        return figures[figureSupplier.getRandomValue(MAX_COUNT_FIGURES)];
    }

    public Figure getDefaultFigure() {
        return circle;
    }

    public int getRandomValue(int value){
        return random.nextInt(value);
    }
}
