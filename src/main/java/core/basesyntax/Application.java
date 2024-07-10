package core.basesyntax;

import java.lang.reflect.Array;

/**
 * Feel free to remove this class and create your own.
 */
public class Application {
    FigureSupplier figureSupplier = new FigureSupplier();
    public static void main(String[] qwe) {
        Figure [] figure = {new Square(),new Rectangle(),new RightTriangle(),
                new IsoscelesTrapezoid()};
        for (Figure figures : figure) {
            System.out.println(figures);
        }
    }
}
