package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = FigureSupplier.getRandomFigure();
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            if (figure instanceof Drawable) {
                ((Drawable) figure).draw();
            }
        }
    }
}
