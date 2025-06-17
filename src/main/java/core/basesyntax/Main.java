package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] randomFigures = new Figure[5];

        for (int i = 0; i < randomFigures.length; i++) {
            Figure rf = fs.getRandomFigure();
            randomFigures[i] = rf;
        }

        for (Figure figure: randomFigures) {
            System.out.println(figure.draw());
        }
    }
}
