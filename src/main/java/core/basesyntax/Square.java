package core.basesyntax;

public class Square extends Figure {
    private double side = 0;

    public Square(String color, double side) {
        super.setName("Square");
        super.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, sides : " + side + " units, color : " + getColor());
    }
}
