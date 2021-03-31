package core.basesyntax;

public class Main {
    public static final int RANGE = 10;

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * RANGE);
        Figure[] randomFigures = new Figure[randomNumber];
        for (int i = 0; i < randomFigures.length; i++) {
            randomFigures[i] = FigureSupplier.getFigure();
        }
        for (Figure figure : randomFigures) {
            figure.drawFigure();
        }
    }
}
