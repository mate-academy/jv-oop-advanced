package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figuresupplier = new FigureSupplier();
        FigureArea[] figures = new FigureArea[5];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figuresupplier.getRandomFigure();
            figures[i].printDraw();
        }
    }
}