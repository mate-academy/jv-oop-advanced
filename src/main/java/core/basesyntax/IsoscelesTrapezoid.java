package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area{
    public IsoscelesTrapezoid(String color, String type) {
        super(color, type);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
