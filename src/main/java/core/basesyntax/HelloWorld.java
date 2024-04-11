package core.basesyntax;

public class HelloWorld {

    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = fs.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = fs.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }
}
