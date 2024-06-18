package core.basesyntax;

public class Main {
    static final int COUNT_OF_FIGURES = 5;

    public static void main(String[] args) {
        FigureSupplier figuresupplier = new FigureSupplier();
        Figure [] figures = new Figure[COUNT_OF_FIGURES];

        for (int i = 0; i < COUNT_OF_FIGURES; i++) {
            figures[i] = figuresupplier.getRandomFigure();
        }
        for (int i = 0; i < COUNT_OF_FIGURES; i++) {
            figures[i].draw();
        }

        Figure a = figuresupplier.getDefaultFigure();
        a.draw();

    }
}

