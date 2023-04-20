package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        super.color = color;
    }

    public String getColor() {
        return super.color;
    }

    public void setColor(String color) {
        super.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square side is " + side + " and square color is " + color);
    }
}
