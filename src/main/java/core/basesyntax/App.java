package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) (Math.random() * 20)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
