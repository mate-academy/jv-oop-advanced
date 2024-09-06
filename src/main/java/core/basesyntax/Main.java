package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arrraysize = 3;
        FigureSupplier figureSupplier = new FigureSupplier();

        FigureColor[] figures = new FigureColor[arrraysize];
        figures[0] = figureSupplier.getRandomRectangle();
        figures[1] = figureSupplier.getRandomCircle();
        figures[2] = figureSupplier.getRandomRightTriangle();

        for (FigureColor figure : figures) {
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
