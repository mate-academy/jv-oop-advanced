package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        new FigureSupplier().generateRandomFigureList(figures);

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}