package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[3];
        figures[0] = figureSupplier.getDefaultFigure();
        for (int i = 1;i < figures.length;i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
