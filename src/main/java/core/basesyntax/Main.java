package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arrraysize = 6;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[arrraysize];
        figures[0] = figureSupplier.getRectangle();
        figures[1] = figureSupplier.getCircle();
        figures[2] = figureSupplier.getRightTriangle();
        figures[3] = new Square(5.0, Color.RED);
        figures[4] = new IsoscelesTrapezoid(10, 10, 20, Color.GREEN);
        figures[5] = new Circle(30, Color.BLUE);

        for (Figure figure : figures) {
            figure.drawable();
        }
    }
}
