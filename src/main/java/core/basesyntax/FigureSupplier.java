package core.basesyntax;

public class FigureSupplier {
    public String getRandomFigure(int a) {
        switch (a) {
            case 1:
                return new Circle().draw();
            case 2:
                return new IsoscelesTrapezoid().draw();
            case 3:
                return new Rectangle().draw();
            case 4:
                return new RightTriangle().draw();
            case 5:
                return new Square().draw();
            default:
                return " Figure: circle, area: 314 sq.units, side: 10 units, color: white";
    
        }
    }
}

