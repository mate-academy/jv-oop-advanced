package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().randomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
