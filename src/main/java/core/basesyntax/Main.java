package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle();
        Figure square = new Square();
        Figure rectangle = new Rectangle();
        Figure rightTriangle = new RightTriangle();
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid();
        Figure defCircle = new FigureSupplier().getDefaultFigure();

        Figure[] figures = {circle, square, rectangle, defCircle, defCircle, defCircle};

        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}
