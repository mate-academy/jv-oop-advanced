package core.basesyntax;

public class FigureSupplier {
    public static final int RANGE = 5;

    public static Figure getFigure() {
        int caseChoice = (int) (Math.random() * RANGE);
        switch (caseChoice) {
            case 0:
                return new Square();
            case 1:
                return new Rectangle();
            case 2:
                return new Triangle();
            case 3:
                return new Circle();
            default:
                return new IsTrapezoid();
        }
    }
}
