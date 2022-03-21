package core.basesyntax;

public class Square extends Figure implements FigureDetails{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public void getArea() {
        System.out.print(side * side + " ");
    }
    @Override
    public void getDetails() {
        getArea();
        System.out.println(color + " " + side);
    }
}
