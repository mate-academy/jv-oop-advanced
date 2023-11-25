package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure [] figures = new Figure[20];
        for (int i = 0; (i < figures.length); i++) {
            figures[i] = (i < (figures.length) / 2 ? new FigureSupplier().getRandomFigure()
                    : new FigureSupplier().getDefaultFigure());
            figures[i].draw();
        }
    }
}
