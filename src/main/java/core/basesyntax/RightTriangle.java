package core.basesyntax;

public class RightTriangle extends Figure {
    private int triangleSide;

    public RightTriangle(String name, String color, int triangleSide) {
        super(color, name);
        this.triangleSide = triangleSide;
    }

    public int getTriangleSide() {
        return triangleSide;
    }

    public void setTriangleSide(int triangleSide) {
        this.triangleSide = triangleSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + (int) getArea() + " sq. units, side length: " + getTriangleSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return triangleSide * Math.sqrt(3) / 4;
    }
}
