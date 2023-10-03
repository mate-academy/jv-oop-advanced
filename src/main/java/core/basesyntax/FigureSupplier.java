package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final String DEFAULT_COLOR = "WHITE";
    static final int DEFAULT_RADIUS = 10;
    static final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{new Circle(), new Rectangle(),
                new IsoscelesTrapezoid(), new Square(), new RightTriangle()};
        int randIndex = random.nextInt(figures.length);
        return figures[randIndex];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
