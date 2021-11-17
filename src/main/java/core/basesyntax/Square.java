package core.basesyntax;

public class Square extends Figure implements DrawAble {
    private int side;
    private double area;

    public Square(String color,int side) {
        this.color = color;
        this.side = side;
        this.area = side * side;
    }

    public Square() {
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", area: " + area
                + " sq.units, side: " + side
                + " units, color: " + color);
    }
}
