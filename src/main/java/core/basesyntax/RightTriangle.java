package core.basesyntax;

public class RightTriangle extends Figure {

    private int sideTriangle;

    public RightTriangle() {
    }

    public void setSideTriangle(int sideTriangle) {
        this.sideTriangle = sideTriangle;
    }

    public int getSideTriangle() {
        return sideTriangle;
    }

    @Override
    public String getName() {
        return "rightTriangle";
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideTriangle * sideTriangle;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq.units"
                + ", sideOfTriangle: " + getSideTriangle() + " units"
                +
                ", color: " + super.getColor());
    }
}
