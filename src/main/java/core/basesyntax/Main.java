package core.basesyntax;

public class Main {
    static final int ARRAY_LIMIT = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LIMIT];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
