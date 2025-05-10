package core.basesyntax;

public class Application extends FigureSupplier {
    private static final int FIGURE_NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_NUMBER];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i + figures.length / 2] = new FigureSupplier().getDefaultFigure();
        }
        for (Figure figure: figures) {
            System.out.println(figure.draw());
        }
    }
}
