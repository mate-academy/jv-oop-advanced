package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) (Math.random() * 50)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.generateFigure();
        }
        for (Figure figure : figures) {
            figure.drawShape();
        }
    }
}
