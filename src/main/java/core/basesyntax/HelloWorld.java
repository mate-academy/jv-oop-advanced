package core.basesyntax;

public class HelloWorld {
    public static final int ARRAYLANGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAYLANGTH];
        FigureSupplier fs = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = fs.getRandomFigure();
                System.out.println(figures[i]);
            } else {
                figures[i] = fs.getDefaultFigure();
                System.out.println(figures[i]);
            }
        }
    }
}
