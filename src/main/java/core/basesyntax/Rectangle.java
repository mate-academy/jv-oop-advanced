package core.basesyntax;

public class Rectangle extends Figure implements FigureArea {

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    public double getArea() {
        return getSideA() * getSideB();
    }
}
