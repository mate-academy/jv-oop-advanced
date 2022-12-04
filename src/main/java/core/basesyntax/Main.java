package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier randomFigure = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[6];
        int count = 1;
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (count <= Math.ceil(arrayOfFigures.length) / 2) {
                arrayOfFigures[i] = randomFigure.getRandomFigure();
                arrayOfFigures[i].getDrawing();
                count++;
            } else {
                arrayOfFigures[i] = randomFigure.getDefaultFigure();
                arrayOfFigures[i].getDefaultDrawing();
            }
        }
    }
}
