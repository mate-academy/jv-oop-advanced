package core.basesyntax;

public class RightTriangle extends Figure implements FigureArea {
    public RightTriangle(int sideA) {
        super(sideA);
    }

    @Override
    public double getArea() {
        return (getSideA() * getSideA()) * 0.5;
    }
}
