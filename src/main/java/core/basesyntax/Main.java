package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        int middleOfFigureArray = (int)figures.length / 2;
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < middleOfFigureArray) ? new FigureSupplier().getRandomFigure()
                                                  : new FigureSupplier().getDefaultFigure();
        }
    }
}
