package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.RandomFigure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figuresupplier.FigureSupplier;
public class Main {
    public static void main(String[] args) {

        Drowable random1 = new RandomFigure();
        Drowable random2 = new RandomFigure();
        Drowable random3 = new RandomFigure();
        Drowable circle = new Circle("Circle", "Red", 21);
        Drowable rectangle = new Rectangle("Rectangle", "Blue", 21, 20);
        Drowable square = new Square("Square", "Yellow", 21);
        FigureSupplier supplierFigure = new FigureSupplier();
        Drowable[] figure = new Drowable[]{supplierFigure.getDefaultFigure(), random1, random2,
                random3, circle, rectangle, square};

        for (Drowable figures : figure) {
            figures.drow();
        }
    }
}
