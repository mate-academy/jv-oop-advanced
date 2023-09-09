package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier randomFigures = new FigureSupplier();
        Figure[] array = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                array[i] = randomFigures.getRandomFigure();
            } else {
                array[i] = randomFigures.getDefaultFigure();
            }
            array[i].getArea();
            array[i].draw();
        }
    }
}
