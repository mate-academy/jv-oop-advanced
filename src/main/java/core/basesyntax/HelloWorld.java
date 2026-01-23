package core.basesyntax;


import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    private static final int FIGURES_COUNT = 6;
    public static void main(String[] args) {

        FigureSupplier supplier = new FigureSupplier();

        List<Behavior> figures = new ArrayList<>();

        int size = FIGURES_COUNT;
        for (int i = 0; i < size / 2; i++) {
            figures.add(supplier.getRandomFigure());
        }
        for (int i = size / 2; i < size; i++) {
            figures.add(supplier.getDefaultFigure());
        }
        for (Behavior figure : figures) {
            figure.draw();
        }
    }
}
