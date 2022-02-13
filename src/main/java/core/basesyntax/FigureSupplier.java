package core.basesyntax;

public class FigureSupplier {
    private Square square = new Square();
    private RightTriangle rightTriangle = new RightTriangle();
    private Circle circle = new Circle();
    private IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    private Rectangle rectangle = new Rectangle();
    private Figure [] figures = new Figure[] {square, rightTriangle, circle,
            isoscelesTrapezoid, rectangle};

    public Figure getRandomFigure() {
        return figures[(int)Math.floor(Math.random() * figures.length)];
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
