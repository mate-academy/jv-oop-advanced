package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final FigureCreator[] figures = {
            new Circle(),
            new IsoscelesTrapezoid(),
            new Rectangle(),
            new RightTriangle(),
            new Square()
    };

    public Figure getRandomFigure() {
        int index = new Random().nextInt(figures.length);
        return figures[index].create();
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor("white");
        circle.setRadius(10);
        return circle;
    }
}
