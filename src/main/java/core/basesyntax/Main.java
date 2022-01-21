package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int countOfFigure = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[countOfFigure];
        for (int i = 0; i < figuresArray.length; i++) {
            if (i < countOfFigure / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure: figuresArray) {
            figure.printFigure();
        }
    }
}
