package core.basesyntax;

public class HelloWorld {
    private static final int MAXVALUE = 6;
    private static final int MINVALUE = 3;

    public static void main(String[] args) {
        Figure [] figures = new Figure[MAXVALUE];
        for (int i = 0; i < figures.length; i++) {
            if (i <= MINVALUE) {
                figures[i] = new FigureSupplier().getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}


