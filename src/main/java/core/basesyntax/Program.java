package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Program {
    public static void main(String[] args) {
        int count = new Random().nextInt(100) + 1;
        List<Figure> figures = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            figures.add(FigureSupplier.getFigure(new Random().nextInt(100) + 1));
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
