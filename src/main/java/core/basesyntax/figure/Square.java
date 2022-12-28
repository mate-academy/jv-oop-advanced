package core.basesyntax.figure;

public class Square extends Figure{
    private double side;
    private static final String FIGURE_NAME = "square";

    public Square(double side){
        this.side = side;
    }

    public Square(String color, double side){
        this.color = color;
        this.side = side;
    }
    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, side: " + side;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
