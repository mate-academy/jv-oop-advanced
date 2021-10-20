package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figure.getRandomFigure();
            System.out.println(figures[i].toString());
        }
    }
}
