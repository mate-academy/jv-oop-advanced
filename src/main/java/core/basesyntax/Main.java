package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] arrayFigures = new Figure[6];
        for (int i = 0; i < arrayFigures.length; i++) {
            if (i < 3) {
                arrayFigures[i] = new FigureSupplier().getRandomFigure();
            } else {
                arrayFigures[i] = new FigureSupplier().getdefaultFigure();
            }
        }
        for (Figure figure: arrayFigures) {
            figure.draw();
        }

    }

}
