package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int leg;

    public IsoscelesTrapezoid(String color, int height, int leg) {
        super(color);
        this.height = height;
        this.leg = leg;
    }

    @Override
    public double calculateArea() {
        return (leg * height);
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
