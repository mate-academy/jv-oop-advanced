package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static AbstractFigure[] figures = {new Square(), new Rectangle(), new RightTriangle(),
            new IsoscelesTrapezoid(), new Circle()};

    public AbstractFigure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public AbstractFigure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor("White");
        circle.setRadius(10);
        return circle;
    }
}
