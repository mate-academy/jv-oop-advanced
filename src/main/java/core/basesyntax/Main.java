package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int numberFigure = 4;
        Figure[] figures = new Figure[numberFigure];
        for (int a = 0; a < figures.length; a++) {
            if (a <= figures.length / 2) {
                figures[a] = new FigureSupplier().getRandomFigure();
                figures[a].draw();
            } else {
                figures[a] = new FigureSupplier().getDefaultFigure();
                figures[a].draw();
            }
        }
    }
}
