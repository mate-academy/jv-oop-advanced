package core.basesyntax;

public class Main {
    static final int MAX_FIG_COUNT = 6;
    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_FIG_COUNT];
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
