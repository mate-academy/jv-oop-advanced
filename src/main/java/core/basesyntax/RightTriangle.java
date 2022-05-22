package core.basesyntax;

public class RightTriangle extends Figure implements Area{
    public RightTriangle(String color, String type) {
        super(color, type);
    }

    @Override
    public double getArea() {
        return 99;
    }
}
