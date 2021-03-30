package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Square sqr = new Square();
        sqr.drawFigure();

        Rectangle rect = new Rectangle();
        rect.drawFigure();

        RightTriangle triangle = new RightTriangle();
        triangle.drawFigure();

        Circle circle = new Circle();
        circle.drawFigure();

        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        trapezoid.drawFigure();
    }
}
