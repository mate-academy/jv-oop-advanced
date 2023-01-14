package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        System.out.println(supplier.getRandomFigure());
    }
}
