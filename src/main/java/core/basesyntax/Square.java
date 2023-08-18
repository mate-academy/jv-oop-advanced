package core.basesyntax;

public class Square extends Figure implements Parametrs{
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
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
