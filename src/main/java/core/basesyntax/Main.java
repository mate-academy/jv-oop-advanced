package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] arr = new Figure[6];
        FigureSupplier f = new FigureSupplier();
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                arr[i] = f.getRandomFigure();
            } else {
                arr[i] = f.getDefaultFigure();
            }
        }
        for (Figure fig: arr) {
            fig.draw();
        }
    }
}
