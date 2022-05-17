package core.basesyntax;

public class Square extends Figure {
    private int lengthOfSide;

    public Square(int lengthOfSide, String color) {
        super(color);
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double area() {
        return lengthOfSide * lengthOfSide;
    }

    @Override
    public void print() {
        System.out.println("Square color " + getColor()
                           + " side length " + lengthOfSide
                           + " area " + area());
    }
}



