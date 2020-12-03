package core.basesyntax;

public class Rectangle extends Figure {
    private double area;
    private double sideA;
    private double sideB;
    private Color color;

    public Rectangle(double sideA, double sideB, Color randomColorIndex) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = randomColorIndex;

        draw();
    }

    @Override
    public Enum getColor() {
        setColor(color);
        return super.getColor();
    }

    @Override
    public void setColor(Enum color) {
        super.setColor(color);
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    @Override
    public double getArea() {
        setArea(sideA * sideB);
        return super.getArea();
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, area : " + getArea() + " sq.units ,"
                            + " side A : " + getSideA() + " units, "
                            + " side B : " + getSideB() + " units, "
                            + "Color = " + getColor());
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

}
