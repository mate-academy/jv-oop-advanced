package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Figure[] figures = new Figure[10];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getDefaultFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].toDraw());
        }
    }
}
