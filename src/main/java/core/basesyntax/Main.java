package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figures[] figuresArr = new Figures[6];

        int arrLength = figuresArr.length;

        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < arrLength; i++) {
            if (i < arrLength / 2) {
                figuresArr[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArr[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < arrLength; i++) {
            figuresArr[i].draw();
        }
    }
}
