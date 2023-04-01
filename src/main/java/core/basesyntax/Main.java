package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        for (int a = 0; a < figures.length; a++) {
            if (a <= figures.length / 2) {
                figures[a] = new FigureSupplier().getRandomFigure();
                figures[a].area = figures[a].getArea();
                figures[a].draw();
            } else {
                figures[a] = new FigureSupplier().getDefaultFigure();
                figures[a].area = figures[a].getArea();
                figures[a].draw();
            }
        }
    }
}
