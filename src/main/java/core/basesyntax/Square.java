package core.basesyntax;

public class Square extends Figure {
    private double side = 0;

    public Square(String color) {
        setName("Square");
        setColor(color);
        this.side = getRandomSize();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, sides : " + side + " units, color : " + getColor());
    }
}
