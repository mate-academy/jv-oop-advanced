package core.basesyntax;

public class MainApp {

    @SuppressWarnings("checkstyle:Indentation")
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Drawable[] figuresArray = new Drawable[6];

        for (int i = 0; i < figuresArray.length / 2; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figuresArray.length / 2; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.getDefaultFigure();

        }

        for (Drawable figure : figuresArray) {
            figure.draw();

        }
    }
}
