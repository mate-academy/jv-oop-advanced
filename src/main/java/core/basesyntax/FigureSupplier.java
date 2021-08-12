package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        double num = Math.random() * 6;
        int count = (int) num;
        double side = Math.random() * 10;
        ColorSupplier color = new ColorSupplier();
        switch (count) {
            case 1:
                return new Square("Square", color.getRandomColor(), Math.ceil(side));
            case 2:
                return new Rectangle("Rectangle", color.getRandomColor(), Math.ceil(side),
                                      Math.abs(Math.ceil(side) - Math.ceil(num)));
            case 3:
                return new RightTriangle("RightTriangle", color.getRandomColor(), Math.ceil(side));
            case 4:
                return new Circle("Circle", color.getRandomColor(), Math.ceil(side));
            default:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", color.getRandomColor(),
                           Math.ceil(side), Math.ceil(side + num), Math.abs(Math.ceil(side)));
        }
    }
}
