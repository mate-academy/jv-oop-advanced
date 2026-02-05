package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figuresCount = 6;

        Figure[] figuresArray = new Figure[figuresCount];

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = i < figuresCount / 2
                    ? new FigureSupplier().getRandomFigure()
                    : new FigureSupplier().getDefaultFigure();
        }

        for (Figure figure : figuresArray) {
            figure.draw();
        }
    }
}
