package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier defaultFigure = new FigureSupplier();

        Figure[] figures = new Figure[6];

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = defaultFigure.getRandomFigure();
            } else {
                figures[i] = defaultFigure.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
