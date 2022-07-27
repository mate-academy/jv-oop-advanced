package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(int a, int b, int c, String color) {
        this.downSide = a;
        this.upSide = b;
        this.height = c;
        setColor(color);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setUpSide(int upSide) {
        this.upSide = upSide;
    }

    public void setDownSide(int downSide) {
        this.downSide = downSide;
    }

    public int getHeight() {
        return this.height;
    }

    public int getUpSide() {
        return this.upSide;
    }

    public int getDownSide() {
        return this.downSide;
    }

    @Override
    public int countArea() {
        return ((downSide + upSide) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: Isosceles Trapezoid\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t height - " + this.height + " units;"
                + "\n\t down side - " + this.downSide + " units;"
                + "\n\t up side - " + this.upSide + " units.";
    }
}
