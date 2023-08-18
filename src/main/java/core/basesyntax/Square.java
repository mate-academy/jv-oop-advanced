package core.basesyntax;

public class Square extends Figure implements Parametrs{
    private double side;

    public Square(String name,String color, double side) {
        super(name, color);
        this.side = side;
        calculateArea();
    }

    public double getArea() {
        return Math.pow(side, 2);
    }


    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return true;
    }
}
