package core.basesyntax;

public class RightTriangle extends Figure implements Area, Draw{
    private int side;


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public RightTriangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return Math.sqrt(numberThree) / numberFour * Math.pow(side,getNumberTwo);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + getArea()
                + " sq.units, " + "side: " + side
                + " units, color: " + super.getColor());


    }
}
