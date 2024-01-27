package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Circle circle = figureSupplier.getDefaultFigure();
        Square square = new Square();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        Rectangle rectangle = new Rectangle();
        RightTriangle rightTriangle = new RightTriangle();

        for (Drawable figure : new Drawable[]{rightTriangle, isoscelesTrapezoid,
                rectangle, square, circle}) {
            figure.draw();
        }
    }
}
