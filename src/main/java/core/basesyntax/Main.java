package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[6];

        for (int i = 0; i < figuresArray.length; i++) {
            if (i < figuresArray.length / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figuresArray) {
            figure.draw();
        }
    }
}
