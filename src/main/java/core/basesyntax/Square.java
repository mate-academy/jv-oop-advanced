package core.basesyntax;

public class Square extends Figure{
    private double side;

    public Square(String color, Double side){
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.2f sq. units, side: %.2f sq. units" +
                        ", color: %s"
                , getArea(), side, getColor()));
    }
}
