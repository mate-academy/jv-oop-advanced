package core.basesyntax.model;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public int getSide1() {
        return sideOne;
    }

    public void setSide1(int side1) {
        this.sideOne = side1;
    }

    public int getSide2() {
        return sideTwo;
    }

    public void setSide2(int side2) {
        this.sideTwo = side2;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure Rectangle"
                + "\nmeasure: " + getArea()
                + "\nColor: " + getColor());
    }
}
