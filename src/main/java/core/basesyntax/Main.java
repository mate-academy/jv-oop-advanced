package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) (Math.random() * 50)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.generateFigure();
        }
        for (Figure figure : figures) {
            figure.drawShape();
        }
    }
}
