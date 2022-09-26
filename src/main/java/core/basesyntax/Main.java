package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figuresupplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier1 = new FigureSupplier();
        Drawable circle = new Circle("red", 21);
        Drawable rectangle = new Rectangle("Yellow", 21, 20);
        Drawable square = new Square("Black", 17);

        Drawable[] qwert = new Drawable[]{figureSupplier1.getRandomFigure(),
                figureSupplier1.getRandomFigure(), figureSupplier1.getRandomFigure(),
                circle, rectangle, square};

        for (Drawable qw : qwert) {
            qw.draw();
        }

    }
}
