package core.basesyntax;

public class FigureSupplier {
    private static final Figure[] FIGURES = {
            new IsoscelesTrapezoid(), new RightTriangle(),
            new Rectangle(), new Circle(), new Square()
    };

    protected static Figure generateFigure() {
        Figure figure = FIGURES[(int) (Math.random()
                * FIGURES.length)];
        if (figure.getClass().equals(Circle.class)) {
            figure = new Circle(ColorSupplier.colorGenerator(), Math.random() * 50);
        } else if (figure.getClass().equals(IsoscelesTrapezoid.class)) {
            figure = new IsoscelesTrapezoid(ColorSupplier.colorGenerator(),
                    Math.random() * 50, Math.random() * 50, Math.random() * 50);
        } else if (figure.getClass().equals(Rectangle.class)) {
            figure = new Rectangle(ColorSupplier.colorGenerator(),
                    Math.random() * 50, Math.random() * 50);
        } else if (figure.getClass().equals(RightTriangle.class)) {
            figure = new RightTriangle(ColorSupplier.colorGenerator(),
                    Math.random() * 50, Math.random() * 50);
        } else if (figure.getClass().equals(Square.class)) {
            figure = new Square(ColorSupplier.colorGenerator(), Math.random() * 50);
        }
        return figure;
    }
}
