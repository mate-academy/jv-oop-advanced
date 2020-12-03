package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        super.setColor(color);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getName().substring(16)
                + ", area: " + getArea() + " sqe. units, side: "
                + getSide() + " units, color: " + getColor().toString().toLowerCase());
    }
}
