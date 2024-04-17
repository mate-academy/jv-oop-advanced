package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] array = {figure.getRandomFigure(), figure.getRandomFigure(),
                figure.getRandomFigure(), figure.getDefaultFigure(),
                figure.getDefaultFigure(), figure.getDefaultFigure()};

        for (int i = 0; i < array.length; i++) {
            array[i].draw();
        }
    }
}
