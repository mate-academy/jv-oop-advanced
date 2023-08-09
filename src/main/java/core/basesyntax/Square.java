package core.basesyntax;

public class Square extends Figure implements Drawable,AreaCalculator{
    private int side;

    public Square(String color,int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }


    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " + side
                + " units, color: " + color);
    }
}
