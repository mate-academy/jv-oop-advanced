package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();

        Rectangle rectangle = new Rectangle();

        RightTriangle rightTriangle = new RightTriangle();

        Circle circle = new Circle();

        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();

        Figure defCircle = new FigureSupplier().getDefaultFigure();


        Figure[] figures = {square, rectangle, rightTriangle, defCircle, defCircle, defCircle};

        for (int i = 0; i < figures.length; i ++){
            figures[i].printInfo();
        }
    }
}
