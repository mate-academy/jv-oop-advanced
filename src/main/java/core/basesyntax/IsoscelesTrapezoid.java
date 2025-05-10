package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upSide, double downSide, double height) {
        super(color);
        setName(getClass().getSimpleName().toLowerCase());
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    public double getUpSide() {
        return upSide;
    }

    public void setUpSide(double upSide) {
        this.upSide = upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq.units"
                + ", upSide: " + upSide + " units"
                + ", downSide: " + downSide + " units"
                + ", height: " + height + " units"
                + ", color: " + getColor());
    }
}


