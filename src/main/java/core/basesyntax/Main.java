package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();

        Figure[] figures = new Figure[6];

        for (int i = 0; i < 6; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            String color = colorSupplier.getRandomColor();
            figures[i].draw();

        }

    }
}


