package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int weigth;

    public Rectangle(int length, int weigth) {
        this.length = length;
        this.weigth = weigth;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return length * weigth;
    }

    public void getInfo() {
        System.out.println("Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq.units, length: "
                + length + "  units, weigth " + weigth + "  units, color: " + super.getColor());
    }

}
