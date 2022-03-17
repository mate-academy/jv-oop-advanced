package core.basesyntax;

public class Square extends Figure implements FigureArea {

    public Square(int sideA) {
        super(sideA);
    }

    @Override
    public double getArea() {
        return getSideA() * getSideA();
    }
}
