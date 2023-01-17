package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_VALUE_FOR_FIGURES = 26;
    private static final int MAX_VALUE_FOR_CIRCLE_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{new Circle(getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new Rectangle(getRandomColor(),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new RightTriangle(getRandomColor(),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new IsoscelesTrapezoid(getRandomColor(),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new Square(getRandomColor(),
                        random.nextInt(MAX_VALUE_FOR_FIGURES))};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, MAX_VALUE_FOR_CIRCLE_RADIUS);
    }
}
