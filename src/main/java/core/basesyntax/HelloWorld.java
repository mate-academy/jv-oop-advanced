package core.basesyntax;


import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        List<Behavior> figures = new ArrayList<>();

        int size = 6;

        // первая половина — случайные
        for (int i = 0; i < size / 2; i++) {
            figures.add(supplier.getRandomFigure());
        }

        // вторая половина — дефолтные
        for (int i = size / 2; i < size; i++) {
            figures.add(supplier.getDefaultFigure());
        }

        // печать всех фигур
        for (Behavior figure : figures) {
            figure.draw(); // или draw()
        }
    }
}
