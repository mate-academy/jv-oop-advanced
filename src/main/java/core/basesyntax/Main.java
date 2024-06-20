package core.basesyntax;

public class Main {
    static final int COUNT_OF_FIGURES = 5;

    public static void main(String[] args) {
        FigureSupplier figuresupplier = new FigureSupplier();
        Figure [] figures = new Figure[COUNT_OF_FIGURES];
        Figure defaultFigure = figuresupplier.getDefaultFigure();

        defaultFigure.draw();

        for (Figure figure : figures) {
            figure = figuresupplier.getRandomFigure();
            figure.draw();
        }
    }
}

