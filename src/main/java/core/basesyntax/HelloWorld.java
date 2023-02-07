package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        Figure defaultFigure = new FigureSupplier().getDefaultFigure();
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = new FigureSupplier().getRandomFigure();

            } else {
                figures[i] = defaultFigure;
            }
        }
    }
}
