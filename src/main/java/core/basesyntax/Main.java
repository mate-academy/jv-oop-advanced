package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figures[] figures = new Figures[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figures figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
