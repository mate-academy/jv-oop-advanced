package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        //In the main() method we need to create an array of figures
        // (the size of array can be 3 or 6, it doesn't matter).
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i += 2) {
            figures[i] = new FigureSupplier().getDefaultFigure();
            figures[i + 1] = new FigureSupplier().getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
