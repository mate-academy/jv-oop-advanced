package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier FigSup = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            if (i<4) {
                figures[i] = FigSup.getRandomFigure();
            } else {
                figures[i] = FigSup.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
