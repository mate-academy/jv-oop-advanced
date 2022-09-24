package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figuresupplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {

        Drawable circle = new Circle("Circle", "Red", 21);
        Drawable rectangle = new Rectangle("Rectangle", "Blue", 21, 20);
        Drawable square = new Square("Square", "Yellow", 21);
        FigureSupplier supplierFigure = new FigureSupplier();


//        for (Drawable figures : figure) {
//            figures.draw();
//        }
    }
}
