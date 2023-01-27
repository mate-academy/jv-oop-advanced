package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int quantityOfFigures = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[quantityOfFigures];
        for (int i = 0;i < figuresArray.length;i++) {
            if (i < (figuresArray.length / 2)) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
            figuresArray [i].draw();
        }

    }
}

