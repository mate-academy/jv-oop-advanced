package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] drawables = new Drawable[6];
        for (int i = 0; i < drawables.length / 2; i++) {
            drawables[i] = figureSupplier.getRandomFigure();
        }

        for (int i = drawables.length / 2; i < drawables.length; i++) {
            drawables[i] = figureSupplier.getDefaultFigure();
        }
        for (Drawable figure : drawables) {
            figure.draw();
        }

    }
}
