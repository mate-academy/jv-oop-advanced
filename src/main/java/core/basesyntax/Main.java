package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            String color = ColorSupplier.getRandomColor();
            figures[i] = FigureSupplier.getRandomFigure(color);
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        for (Figure f : figures) {
            f.draw();
        }
    }
}
