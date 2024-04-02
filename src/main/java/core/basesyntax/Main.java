package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureIndex = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            figures[i] = figureIndex.getRandomFigure();

        }
        for (int i = 0; i < 6; i++) {
            System.out.println(figures[i].getFigureInfo());
        }
    }
}
