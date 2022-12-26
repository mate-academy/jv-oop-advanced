package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] allFigures = new Figure[6];
        for (int i = 0; i < allFigures.length / 2; i++) {
            allFigures[i] = new FigureSupplier().getRandomFigure();
            allFigures[i].draw();
        }
        for (int i = allFigures.length / 2; i < allFigures.length; i++) {
            allFigures[i] = new FigureSupplier().getDefaultFigure();
            allFigures[i].draw();
        }
    }
}
