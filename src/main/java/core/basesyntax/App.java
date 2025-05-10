package core.basesyntax;

public class App {

    public static void main(String[] args) {
        Figures[] figures = Figures.values();
        Figure[] resultArray = new Figure[figures.length];
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                Figure getFigure = figure.getRandomFigure();
                resultArray[i] = getFigure;
                getFigure.draw();
            } else {
                Figure defaultFigure = figure.getDefaultFigure();
                resultArray[i] = defaultFigure;
                defaultFigure.draw();
            }
        }
    }
}
