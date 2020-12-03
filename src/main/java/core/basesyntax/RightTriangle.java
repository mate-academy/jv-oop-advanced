package core.basesyntax;

public class RightTriangle extends Figure {
    private double cathetusA;
    private double cathetusB;
    private double hypotenuse;

    public RightTriangle(double cathetusA, double cathetusB, Color color) {
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
        this.hypotenuse = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
        super.setColor(color);
    }

    public double getCathetusA() {
        return cathetusA;
    }

    public void setCathetusA(double cathetusA) {
        this.cathetusA = cathetusA;
    }

    public double getCathetusB() {
        return cathetusB;
    }

    public void setCathetusB(double cathetusB) {
        this.cathetusB = cathetusB;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return cathetusA * cathetusB / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getName().substring(16)
                + ", area: " + String.format("%.3f", getArea()) + " sqr. units, cathetus a: "
                + getCathetusA() + " units, cathetus b: "
                + getCathetusB() + " units, hypotenuse: "
                + String.format("%.3f", getHypotenuse()) + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
