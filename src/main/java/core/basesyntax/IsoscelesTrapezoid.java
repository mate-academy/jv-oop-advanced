package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int leg;

    @Override
    public double calculateArea() {
        return (leg * height);
    }

    public IsoscelesTrapezoid(int height, int leg, String color) {
        super(color);
        this.height = height;
        this.leg = leg;
    }

    @Override
    public String draw() {
        return "IsoscelesTrapezoid{"
                + "height=" + height
                + ", leg=" + leg
                + ", color='" + color
                + '\'' + '}';
    }
}
