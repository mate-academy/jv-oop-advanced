package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_VALUE_FOR_FIGURES = 26;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{new Circle("circle", getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new Rectangle("rectangle", getRandomColor(),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new RightTriangle("triangle", getRandomColor(),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new IsoscelesTrapezoid("isosceles trapezoid", getRandomColor(),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES),
                        random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new Square("square", getRandomColor(),
                        random.nextInt(MAX_VALUE_FOR_FIGURES))};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("circle", "white", 10);
    }
}
