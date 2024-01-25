package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = new FigureSupplier().getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
