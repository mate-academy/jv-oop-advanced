package core.basesyntax;

public class Main {
    public static final int RANGE = 10;

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * RANGE);
        Figure[] randomFigures = new Figure[randomNumber];
        for (int i = 0; i < randomFigures.length; i++) {
            Figure temporaryFigure = new FigureSupplier().getFigure();
            randomFigures[i] = temporaryFigure;
        }
        for (Figure figure : randomFigures) {
            figure.draw();
        }
    }
}
