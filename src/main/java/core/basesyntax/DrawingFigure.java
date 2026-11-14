package core.basesyntax;

import core.basesyntax.enemy.IsoscelesTrapezoid;
import core.basesyntax.enemy.Rectangle;
import core.basesyntax.enemy.Square;
import core.basesyntax.random.FigureSupplier;

public class DrawingFigure {
    private Figure[] figure = new Figure[6];

    public void main(String[] args) {
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = new FigureSupplier().getRandomFigure();
        }

        figure[3] = new Rectangle(10, 20, "red");
        figure[4] = new Square(5, "blue");
        figure[5] = new IsoscelesTrapezoid(10, 15, 20, 25, "green");

        for (Figure figures : figure) {
            figures.draw();
            System.out.println("Area - " + figures.getArea());
        }
    }

}
