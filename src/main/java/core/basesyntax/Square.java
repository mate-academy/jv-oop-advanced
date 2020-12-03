package core.basesyntax;

public class Square extends Figure {
    private double area;
    private double side;
    private Color color;

    public Square(double side, Color randomColorIndex) {
        this.side = side;
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
    public void setArea() {

    }

    @Override
    public double getArea() {
        setArea(side * side);
        return super.getArea();
    }

    @Override
    public void draw() {
        System.out.println(" Square : Area : " + getArea() + " sq.units ,"
                             + " Side : " + getSide() + " units, "
                             + "Color = " + getColor());
    }

    public double getSide() {
        return side;
    }
}
