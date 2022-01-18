public class Rectangle extends Figure {
    private int height;
    private int wigth;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWigth() {
        return wigth;
    }

    public void setWigth(int wigth) {
        this.wigth = wigth;
    }

    @Override
    public double getArea() {
        return height * wigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, "
                + " height " + getHeight() + " units"
                + " width " + getWigth() + " units "
                + " color " + getColor());
    }
}
