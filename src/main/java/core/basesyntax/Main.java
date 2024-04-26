package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i % 2 == 0) {
                figures[i] = FigureSupplier.getRandomFigure();
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            if (figure instanceof Draw) {
                ((Draw) figure).draw();
            }
        }
    }
}
