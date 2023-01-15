package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int Figures_Count = 6;
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[Figures_Count];
        for (int i = 0; i < figures.length; i++) {
            if (i <= (figures.length / 2)) {
                figures[i] = supplier.getRandomFigure();
            }
            else {
                figures[i] = supplier.getDefaultFigure();
            }
        }
        System.out.println(Arrays.toString(figures));
    }
}
