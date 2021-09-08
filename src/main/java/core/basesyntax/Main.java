package core.basesyntax;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int minMaxArrayLength = new Random().nextInt(10) + 1;
        Figure[] randomFigureList = new Figure[minMaxArrayLength];
        FigureSupplier figureSupplierObjectInitialization = new FigureSupplier();

        for (int i = 0; i < randomFigureList.length; i++) {
            Figure newRandomFigure = figureSupplierObjectInitialization.getRandomFigure();
            randomFigureList[i] = newRandomFigure;
        }

        for (Figure figure: randomFigureList) {
            figure.drawFigure();
        }
    }

}

