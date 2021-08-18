package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) ((Math.random() * 20) + 1)];
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].setColor(colorSupplier.getRandomColor());
            figures[i].draw();
        }
    }
}
