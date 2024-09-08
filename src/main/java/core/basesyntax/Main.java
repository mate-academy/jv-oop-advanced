package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arrraysize = 3;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[arrraysize];
        figures[0] = figureSupplier.getRectangle();
        figures[1] = figureSupplier.getCircle();
        figures[2] = figureSupplier.getRightTriangle();

        for (Figure figure : figures) {
            figure.drawable();
        }

        Square squareFirst = new Square(5.0, Color.RED);
        squareFirst.drawable();
        IsoscelesTrapezoid isoscelesTrapezoidFirst
                = new IsoscelesTrapezoid(10, 10, 20, Color.GREEN);
        isoscelesTrapezoidFirst.drawable();
        Circle circleFirst = new Circle(30, Color.BLUE);
        circleFirst.drawable();
    }
}
