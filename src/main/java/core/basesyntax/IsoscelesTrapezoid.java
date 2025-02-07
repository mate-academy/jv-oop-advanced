package core.basesyntax;

public abstract class IsoscelesTrapezoid extends Figure {
    private final Color color;
    private int height;
    private int bases;

    public IsoscelesTrapezoid(Color color, int height, int bases) {
        this.height = height;
        this.bases = bases;
        this.color = color;
    }

    @Override
    public String draw(){
        return ("Figure: IsoscelesTrapezoid, area: " + getArea() + "sq. units," + "height: " + height
                + "units" + "bases: " + bases + "units, " + "color: " + color);
    }

    @Override
    public double getArea() {
        return (height + height)/2 * bases;
    }
}
