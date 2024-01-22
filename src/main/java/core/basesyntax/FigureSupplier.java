package core.basesyntax;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = (int) (Math.random() * 5);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                double side = Math.random() * 10 + 1;
                return new Square(color, side);
            case 1:
                double width = Math.random() * 10 + 1;
                double height = Math.random() * 10 + 1;
                return new Rectangle(color, width, height);
            case 2:
                double firstLeg = Math.random() * 10 + 1;
                double secondLeg = Math.random() * 10 + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                double radius = Math.random() * 10 + 1;
                return new Circle(color, radius);
            case 4:
                double topBase = Math.random() * 10 + 1;
                double bottomBase = Math.random() * 10 + 1;
                double height2 = Math.random() * 10 + 1;
                return new IsoscelesTrapezoid(color, topBase, bottomBase, height2);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
