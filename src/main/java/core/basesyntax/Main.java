package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figSup = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figSup.getRandomFigure();
            } else {
                figures[i] = figSup.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
