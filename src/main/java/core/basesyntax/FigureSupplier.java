package core.basesyntax;

public class FigureSupplier {
    public String getRandomFigure(int a) {
        switch (a) {
            case 1:
                return new IsoscelesTrapezoid().draw();
            case 2:
                return new Rectangle().draw();
            case 3:
                return new RightTriangle().draw();
            case 4:
                return new Square().draw();
            default:
                return new Circle().draw();
        }
    }
}

