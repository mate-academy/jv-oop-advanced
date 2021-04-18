package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int LENGTH_RANDOM_LIMIT = 100;

    public static double lengthGen() {
        return Math.random() * LENGTH_RANDOM_LIMIT + 1;
    }

    public static double lengthGen(double topSide, double side) {
        return Math.random() * (2 * side + 1) + topSide;
    }

    public Figure figureGenerator() {

        switch ((int)(Math.random() * (FIGURE_NUMBER)) + 1) {
            case 1 :
                return new Square(lengthGen(), ColorSupplier.colorGen());
            case 2 :
                return new Rectangle(lengthGen(),lengthGen(), ColorSupplier.colorGen());
            case 3 :
                return new Circle(lengthGen(), ColorSupplier.colorGen());
            case 4 :
                return new IsoscelesTrapezoid(lengthGen(), lengthGen(), ColorSupplier.colorGen());
            default :
                return new RightTriangle(lengthGen(), lengthGen(), ColorSupplier.colorGen());
        }
    }
}
