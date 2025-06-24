package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int size = 6;
        AreaCalculable[] figures = new AreaCalculable[size];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < size / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = size / 2; i < size; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (AreaCalculable figure : figures) {
            if (figure instanceof Drawable) {
                ((Drawable) figure).draw();
            }
        }
    }
}

