package core.basesyntax.figures;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    Figure[] figures = new Figure[]{new Circle(), new IsoscelesTrapezoid(), new RightTriangle(), new Rectangle(), new Square()};
    Random random = new Random();
    public Figure getRandomFigure() {
        return figures[random.nextInt(figures.length - 1)];
    }
    public Figure getDefoultFigure() {
        Circle circle = new Circle();
        circle.color = "White";
        return circle;
    }
}
