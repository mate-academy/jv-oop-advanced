package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: square" + ", color: "
                +
                getColor() + ", side: " + getSide() + ", area: " + getArea());
    }
}
