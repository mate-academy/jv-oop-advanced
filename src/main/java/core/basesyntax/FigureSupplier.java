package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "WHITE";

    public Figure getRandomFigure() {
        Figure[] figures = {new Square(), new Rectangle(), new RightTriangle(),
                new Circle(), new IsoscelesTrapezoid()};
        /*int index = new Random().nextInt(10000);
        while (index > figures.length - 1) {
            int divider = new Random().nextInt(100);
            index /= (divider != 0) ? divider : 1;
        }*/
        return figures[new Random().nextInt(figures.length - 1)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
