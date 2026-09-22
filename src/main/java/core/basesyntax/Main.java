package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int figuresNumber = 6;
        Figure[] figures = new Figure[figuresNumber];

        FigureSupplier figuresSupplier = new FigureSupplier();
        int half = figuresNumber / 2;

        for (int i = 0; i < figuresNumber; i++) {
            if (i < half) {
                figures[i] = figuresSupplier.getRandomFigure();
            } else {
                figures[i] = figuresSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
