package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    private final Figure[] figures = new Figure[]{new Circle(), new IsoscelesTrapezoid(),
            new RightTriangle(), new Rectangle(), new Square()};
    private Random random = new Random();

    public Figure getRandomFigure() {
        return figures[random.nextInt(figures.length - 1)];
    }

    public Figure getDefoultFigure() {
        Circle circle = new Circle();
        circle.setColor("White");
        return circle;
    }
}
