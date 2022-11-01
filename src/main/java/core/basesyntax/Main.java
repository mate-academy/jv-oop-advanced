package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figureLists.length / 2; i++) {
            figureLists[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = figureLists.length / 2; i < figureLists.length; i++) {
            figureLists[i] = new FigureSupplier().getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
