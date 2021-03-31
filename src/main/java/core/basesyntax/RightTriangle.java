package core.basesyntax;

public class RightTriangle extends Figure implements Shape {
    private int hypotenuse;
    private int cathetusA;
    private int cathetusB;

    public RightTriangle(int hypotenuse, int cathetusA, int cathetusB, String color) {
        super(color);
        this.hypotenuse = hypotenuse;
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    public void setParameters(int hypotenuse, int cathetusA, int cathetusB) {
        this.hypotenuse = hypotenuse;
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    @Override
    public double getArea() {
        return Math.round((cathetusA * cathetusB) / 2.0);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, side "
                + "hypotenuse: " + hypotenuse + " units, color: " + getColor());
    }
}
