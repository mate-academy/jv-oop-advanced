package core.basesyntax;

public class Square extends Shapes implements Area, Draw {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public String getDraw() {
        return ("Figure: " + ",area: " + getArea() + "side length: " + side);
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public String figure() {
        return "Square";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Have 4 corners 90 degrees");
    }
}


