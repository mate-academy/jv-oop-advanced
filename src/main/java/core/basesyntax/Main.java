package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        FigureSupplier figureSupplier = new FigureSupplier();
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = new Circle(10,Color.WHITE.toString());
        figures[3] = new Square(5,Color.BLACK.toString());
        for (Figure figure : figures) {
            figure.toString();
        }
    }
}
