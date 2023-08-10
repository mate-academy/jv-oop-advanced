package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier rndFigure = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = rndFigure.getRandomFigure();
            } else {
                figures[i] = rndFigure.getDefaultFigure();
            }
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
