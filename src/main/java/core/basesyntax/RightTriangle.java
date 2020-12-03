package core.basesyntax;

public class RightTriangle extends Figure {
    private double area;
    private double hypotenuse;
    private double cathetusA;
    private double cathetusB;

    public RightTriangle(double hypotenuse, double catathetusA,
                         double catathetusB, Color color) {
        this.cathetusA = catathetusA;
        this.cathetusB = catathetusB;
        this.hypotenuse = hypotenuse;

        area = cathetusA * cathetusB / 2;

        super.setColor(color);

    }

    @Override
    public double getArea(double area) {
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle, area : " + getArea(area) + " sq.units ,"
                            + " Cathetus A : " + getCathetusA() + " units, "
                            + " Cathetus B : " + getCathetusB() + " units, "
                            + " Hypotenuse: " + getHypotenuse() + " units, "
                            + "Color = " + super.getColor());
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getCathetusA() {
        return cathetusA;
    }

    public double getCathetusB() {
        return cathetusB;
    }
}
