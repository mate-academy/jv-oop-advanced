package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                figure.getRandomFigure().draw();
            } else {
                figure.getDefaultFigure().draw();
            }
        }
    }
}
