package core.basesyntax;

public class FigureSupplier {
    public static final int CASE_RANGE = 5;
    public static final int RANDOM_VALUE_RANGE = 10;

    public Figure getFigure() {
        int caseChoice = (int) (Math.random() * CASE_RANGE);
        switch (caseChoice) {
            case 0:
                String color1 = new ColorSupplier().getRandomColor();
                double side = Math.random() * RANDOM_VALUE_RANGE;
                return new Square(side, color1);
            case 1:
                String color2 = new ColorSupplier().getRandomColor();
                double length = Math.random() * RANDOM_VALUE_RANGE;
                double width = Math.random() * RANDOM_VALUE_RANGE;
                return new Rectangle(length, width, color2);
            case 2:
                String color3 = new ColorSupplier().getRandomColor();
                double longSide = Math.random() * RANDOM_VALUE_RANGE;
                double shortSide = Math.random() * RANDOM_VALUE_RANGE;
                return new Triangle(longSide, shortSide, color3);
            case 3:
                String color4 = new ColorSupplier().getRandomColor();
                double radius = Math.random() * RANDOM_VALUE_RANGE;
                return new Circle(radius, color4);
            default:
                String color5 = new ColorSupplier().getRandomColor();
                double base = Math.random() * RANDOM_VALUE_RANGE;
                double top = Math.random() * RANDOM_VALUE_RANGE;
                double height = Math.random() * RANDOM_VALUE_RANGE;
                return new IsTrapezoid(base, top, height, color5);
        }
    }
}
