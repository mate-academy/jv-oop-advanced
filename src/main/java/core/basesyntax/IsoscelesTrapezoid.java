package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private int upSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(int a, int b, int c, String color) {
        this.downSide = a;
        this.upSide = b;
        this.height = c;
        this.color = color;
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

    public void setColor(String color) {
        this.color = color;
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

    public String getColor() {
        return this.color;
    }


    @Override
    public int countArea() {
        return ((downSide + upSide) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: Isosceles Trapezoid\n\tcolor - " + this.color + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t height - " + this.height + " units;"
                + "\n\t down side - " + this.downSide + " units;"
                + "\n\t up side - " + this.upSide + " units.";
    }
}
