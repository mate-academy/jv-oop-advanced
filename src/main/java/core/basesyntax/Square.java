package core.basesyntax;

public class Square extends Figure implements Area, Draw{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,getNumberTwo);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rightTriangle, area: " + getArea()
                + " sq.units, " + "side: " + side
                + " units, color: " + super.getColor());
    }
}
