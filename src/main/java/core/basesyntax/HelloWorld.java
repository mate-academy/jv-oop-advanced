package core.basesyntax;

import java.util.Arrays;

class HelloWorld {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(1,1);
        Figure[] equal = getFig();
        for (int i = 0; i < equal.length; i++) {
            if (i < equal.length / 2) {
                equal[i].draw();
            } else {
                System.out.println(Arrays.toString(figureSupplier.getDefaultFigure()));
                break;
            }
        }

    }

    public static Figure[] getFig() {
        FigureSupplier figureSupplier = new FigureSupplier(6, 50);
        Figure[] types = new Figure[6];
        for (int i = 0; i < 6; i++) {
            types[i] = figureSupplier.getRandomFigure();
        }
        return types;
    }

}
