package core.basesyntax;

public class HelloWorld {
    private static final int MAX_VALUE = 6;
    private static final int MIN_VALUE = 3;

    public static void main(String[] args) {
        Figure [] figures = new Figure[MAX_VALUE];
        for (int i = 0; i < figures.length; i++) {
            if (i <= MIN_VALUE) {
                figures[i] = new FigureSupplier().getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}


