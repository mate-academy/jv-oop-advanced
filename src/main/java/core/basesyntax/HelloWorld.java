package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figuresArr = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figuresArr.length / 2; i++) {
            figuresArr[i] = figureSupplier.getRandomFigure();
            System.out.println("Figure: " + figuresArr[i].getClass().getSimpleName() + ", area: "
                    + figuresArr[i].area() + " sq. units, " + figuresArr[i].getSize() + "color: "
                        + figuresArr[i].color().toLowerCase());
        }
        for (int i = 3; i < figuresArr.length; i++) {
            figuresArr[i] = figureSupplier.getDefaultFigure();
            System.out.println("Figure: " + figuresArr[i].getClass().getSimpleName() + ", area: "
                    + figuresArr[i].area() + " sq. units, " + figuresArr[i].getSize() + "color: "
                        + figuresArr[i].color().toLowerCase());
        }
    }
}
