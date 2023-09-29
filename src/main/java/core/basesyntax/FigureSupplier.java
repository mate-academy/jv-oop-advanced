package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final String defaultColor = "WHITE";
    private final String defaultName = "circle";
    private final int defaultRadius = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{new Circle(), new Rectangle(),
                new IsoscelesTrapezoid(), new Square(), new RightTriangle()};
        int randIndex = random.nextInt(figures.length);
        return figures[randIndex];
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultName, defaultRadius);
    }
}
