package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int figureNumber = 11;

        int figuresNumberInSetOne = 0;

        if (figureNumber % 2 == 0) {
            figuresNumberInSetOne = figureNumber / 2;
        } else {
            figuresNumberInSetOne = figureNumber / 2 + 1;
        }

        Figure [] result = new Figure[figureNumber];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figuresNumberInSetOne; i++) {
            result [i] = figureSupplier.getRandomFigure();
            result [i].draw();
        }

        for (int i = figuresNumberInSetOne; i < figureNumber; i++) {
            result [i] = figureSupplier.getDefaultFigure();
            result [i].draw();
        }
    }
}
