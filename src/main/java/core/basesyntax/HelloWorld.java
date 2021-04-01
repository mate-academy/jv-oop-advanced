package core.basesyntax;

import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Random random = new Random();
        Shape[] arrayShape = supplier.randomFigure();

        for (Shape shaped : arrayShape) {
            System.out.println(shaped.draw());
        }
    }
}
