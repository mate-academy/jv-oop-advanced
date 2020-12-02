package core.basesyntax;

public class Square extends Figure implements Draw {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw square");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public void unicMetod() {
        System.out.println("Metod square");
    }
}
