package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(int downSide, int upSide, int height, String color) {
        this.downSide = downSide;
        this.upSide = upSide;
        this.height = height;
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
        return height;
    }

    public int getUpSide() {
        return upSide;
    }

    public int getDownSide() {
        return downSide;
    }

    @Override
    public int countArea() {
        return ((downSide + upSide) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: Isosceles Trapezoid\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + countArea() + " sq. units;"
                + "\n\t height - " + height + " units;"
                + "\n\t down side - " + downSide + " units;"
                + "\n\t up side - " + upSide + " units.";
    }
}
