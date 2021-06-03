package core.basesyntax;



public class Square extends Figure{
    private double side;

    public Square(String color,double side) {
        setColor(color);
        this.side = side;
        areaCalculate();
    }

    @Override
    public void areaCalculate() {
        setArea(side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, firstSide: " + side
                + " units, color: " + getColor());
    }
}
