package core.basesyntax;

public class RightTriangle extends Figure {
    private double area;
    private double hypotenuse;
    private double cathetusA;
    private double cathetusB;
    private Color color;

    public RightTriangle(double hypotenuse, double catathetusA,
                         double catathetusB, Color randomColorIndex) {
        this.cathetusA = catathetusA;
        this.cathetusB = catathetusB;
        this.hypotenuse = hypotenuse;
        this.color = randomColorIndex;

        draw();
    }

    @Override
    public void setColor(Enum color) {
        super.setColor(color);
    }

    @Override
    public Enum getColor() {
        setColor(color);
        return super.getColor();
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    @Override
    public double getArea() {
        setArea(cathetusA * cathetusB / 2);
        return super.getArea();
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle, area : " + getArea() + " sq.units ,"
                            + " Cathetus A : " + getCathetusA() + " units, "
                            + " Cathetus B : " + getCathetusB() + " units, "
                            + " Hypotenuse: " + getHypotenuse() + " units, "
                            + "Color = " + getColor());
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
