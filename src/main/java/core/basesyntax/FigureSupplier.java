package core.basesyntax;

public class FigureSupplier {
    private static final int FIRST = 5;

    public static double lengthGen() {
        return Math.random() * 100 + 1;
    }

    public static double lengthGen(double value1, double value2) {
        return Math.random() * (2 * value2 + 1) + value1;
    }

    public Figure figureGenerator() {

        switch ((int)(Math.random() * (FIRST)) + 1) {
            case 1 :
                return new Square(lengthGen());
            case 2 :
                return new Rectangle(lengthGen(),lengthGen());
            case 3 :
                return new Circle(lengthGen());
            case 4 :
                return new IsoscelesTrapezoid(lengthGen(), lengthGen());
            case 5 :
                return new RightTriangle(lengthGen(), lengthGen());
            default :
                return null;
        }
    }
}
