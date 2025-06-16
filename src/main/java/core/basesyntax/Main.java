package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure randomFigure = fs.getRandomFigure();

        System.out.println(randomFigure);
    }
}
