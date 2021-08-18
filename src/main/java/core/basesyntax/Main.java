package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] figures = new Figure[(int) (Math.random() * 10)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figure.getRandomFigure();
            figures[i].draw();
        }
    }
}
