package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        FigureSupplier figureSupplier = new FigureSupplier();
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = new Circle(Color.white, 10);
        figures[3] = new Square(Color.black, 5);
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
