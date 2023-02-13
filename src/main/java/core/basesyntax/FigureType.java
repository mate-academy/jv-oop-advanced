package core.basesyntax;

public enum FigureType {
    CIRCLE(new Circle()),
    RIGHT_TRIANGLE(new RightTriangle()),
    RECTANGLE(new Rectangle()),
    SQUARE(new Square()),
    ISOSCELES_TRAPEZOID(new IsoscelesTrapezoid());
    FigureType(Figure figure) {

    }
}
