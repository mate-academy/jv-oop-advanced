package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int randomNumberForMassive1 = new FigureSupplier().randomForMassive();
        int randomNumberForMassive2 = new FigureSupplier().randomForMassive();
        int randomNumberForMassive3 = new FigureSupplier().randomForMassive();
        Figure figure1 = new FigureSupplier().getRandomFigure(randomNumberForMassive1);
        Figure figure2 = new FigureSupplier().getRandomFigure(randomNumberForMassive2);
        Figure figure3 = new FigureSupplier().getRandomFigure(randomNumberForMassive3);
        Figure defaultFigure1 = new FigureSupplier().getDefaultFigure();
        Figure defaultFigure2 = new FigureSupplier().getDefaultFigure();
        Figure defaultFigure3 = new FigureSupplier().getDefaultFigure();
        Figure[] figures = {figure1,figure2,figure3,defaultFigure1,defaultFigure2,defaultFigure3};

        System.out.println(Arrays.toString(figures));
    }
}
