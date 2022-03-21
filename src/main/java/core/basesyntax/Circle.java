package core.basesyntax;

public class Circle extends Figure {
    public Circle(int sideA) {
        super(sideA);
    }

    @Override
    public double getArea() {
        return Math.PI * getSideA() * getSideA();
    }
}
