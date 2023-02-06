package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private static final int RANDOM_FIGURE = new Random().nextInt(FIGURE_COUNT);

    public Figure getRandomFigure() {
        Figure[] figuresArr = {new Circle(), new Rectangle(),
                new Square(), new IsoscelesTrapezoid(), new RightTriangle()};
        return figuresArr[RANDOM_FIGURE];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
