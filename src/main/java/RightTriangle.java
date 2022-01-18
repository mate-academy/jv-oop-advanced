public class RightTriangle extends Figure {
    private int side;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea() + " sq.units, "
                + " height " + getHeight() + " units"
                + " size " + getSide() + " units "
                + "  color " + getColor());
    }
}
