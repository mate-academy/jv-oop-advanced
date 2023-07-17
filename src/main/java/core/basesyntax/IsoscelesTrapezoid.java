package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, color: " + super.getColor());
    }
}
