package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        figures[3] = new Circle("circle", "GREEN", 3);
        figures[4] = new Square("square", "YELLOW", 2);
        figures[5] = new RightTriangle("rightTriangle", "BLACK", 3, 6);

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
