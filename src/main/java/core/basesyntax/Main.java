package core.basesyntax;


public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            if (figure == null) {
                figure = figureSupplier.getDefaultFigure();
            }
            System.out.println(figure.toString());
        }
    }
}
