package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure randomFigure = new FigureSupplier().getRandomFigure();
        Figure defaultFigure = new FigureSupplier().getDefaultFigure();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = randomFigure;
            } else {
                figures[i] = defaultFigure;
            }
        }
    }


}
