package core.basesyntax;

public class Main {
    static final int figuresLenght = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[figuresLenght];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresLenght; i++) {
            if (i < figuresLenght / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
