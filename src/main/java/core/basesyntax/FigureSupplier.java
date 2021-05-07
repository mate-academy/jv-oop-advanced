package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int i = Main.rnd(5);
        switch (i) {
            case (0):
                return new Square();

            case (1):
                return new Rectangle();

            case (2):
                return new RightTriangle();

            case (3):
                return new Circle();

            case (4):
                return new IsoscelesTrapezoid();

            default:
                return null;
        }
    }
}
