package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure(int number) {
        switch (number) {
            case 0:
                return new Square();
            case 1:
                return new Rectangle();
            case 2:
                return new RightTriangle();
            case 3:
                return new IsoscelesTrapezoid();
            default:
                return new Circle();
        }
    }

    Figure getDefaultFigure(int number) {
        switch (number) {
            case 0:
                return new Square(20, Color.BLUE);
            case 1:
                return new Rectangle(20, 18,Color.WHITE);
            case 2:
                return new RightTriangle(15,13,Color.GREY);
            case 3:
                return new IsoscelesTrapezoid(11,45,Color.PINK);
            default:
                return new Circle(10,Color.WHITE);
        }
    }
}
