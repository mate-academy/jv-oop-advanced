package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        ColoredFigure[] figures = new ColoredFigure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = (ColoredFigure) new FigureSupplier().getDefaultFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
