package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figures[] figuresArr = new Figures[6];

        int arrLength = figuresArr.length;

        FigureSupplier figureSupplier = new FigureSupplier();

        //creating figures array
        for (int i = 0; i < arrLength; i++) {
            if (i < arrLength / 2) {
                figuresArr[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArr[i] = figureSupplier.getDefaultFigure();
            }
        }

        //drawing the figures from the array
        for (int i = 0; i < arrLength; i++) {
            figuresArr[i].draw();
        }
    }
}
