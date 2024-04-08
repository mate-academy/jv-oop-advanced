package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public AbstractFigure getRandomFigure() {
        AbstractFigure figure;
        int index = new Random().nextInt(Figures.values().length);
        if (index == 0) {
            figure = new Circle(new Random().nextInt());
        } else if (index == 1) {
            figure = new IsoscelesTrapezoid(new Random().nextInt(), new Random().nextInt(), new Random().nextInt());
        } else if (index == 2) {
            figure = new Rectangle(new Random().nextInt(), new Random().nextInt());
        } else if (index == 3) {
            figure = new RightTriangle(new Random().nextInt(), new Random().nextInt());
        } else {
            figure = new Square(new Random().nextInt());
        }
        figure.setColor(new ColorSupplier().getRandomColor());
        return figure;
    }

    public AbstractFigure getDefaultFigure() {
        AbstractFigure figure = new Circle(new Random().nextInt());
        return figure;
    }
}
