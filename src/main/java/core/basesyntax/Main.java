package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Square square1 = new Square(5.0, Color.RED);
        square1.draw();
        IsoscelesTrapezoid isoscelesTrapezoid1 = new IsoscelesTrapezoid(10, 10, 20, Color.GREEN);
        isoscelesTrapezoid1.draw();

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[3];
        figures[0] = figureSupplier.getRandomRectangle();
        figures[1] = figureSupplier.getRandomCircle();
        figures[2] = figureSupplier.getRandomRightTriangle();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
