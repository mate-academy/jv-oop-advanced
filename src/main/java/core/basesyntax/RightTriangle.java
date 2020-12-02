package core.basesyntax;

public class RightTriangle extends Figure {
    private int cathetus1;
    private int cathetus2;

    public RightTriangle(int cathetus1, int cathetus2, Color color) {
        super(color);
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    public int getHypotenuse() {
        return (int) Math.sqrt(Math.pow(this.cathetus1, 2) + Math.pow(this.cathetus2, 2));
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle, area: " + getArea() + " sq.units, hypotenuse length: "
                + getHypotenuse() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return this.cathetus1 * this.cathetus2 / 2;
    }
}
