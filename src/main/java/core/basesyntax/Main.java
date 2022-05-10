package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i += 2) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i + 1] = new FigureSupplier().getDefaultFigure();
        }
        for (Figure figure: figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
