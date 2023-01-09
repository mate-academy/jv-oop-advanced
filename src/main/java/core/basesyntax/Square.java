package core.basesyntax;

public class Square extends Figure implements Area {
    private int side;
    public double getSide() {return side; }
    public void setSide(int side) {this.side = side; }
    @Override
    public double getArea() {
        return side * side;
    }
}
