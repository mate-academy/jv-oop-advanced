package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) (Math.random() * 2000)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
