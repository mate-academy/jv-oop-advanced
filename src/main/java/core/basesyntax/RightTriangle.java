package core.basesyntax;

public class RightTriangle extends Figure {
    private double cathetusA;
    private double cathetusB;
    private double hypotenuse;
    private Color color;

    public RightTriangle(double cathetusA, double cathetusB, Color color) {
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
        this.hypotenuse = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
        this.color = color;
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

    @Override
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
