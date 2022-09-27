package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < 3) {
                figure[i] = new FigureSupplier().getRandomFigure();
            } else {
                figure[i] = new FigureSupplier().getDefaultFigure();
            }
        }
        for (int i = 0; i < figure.length; i++) {
            figure[i].drawFigure();
        }
    }
}
