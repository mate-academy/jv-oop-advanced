package core.basesyntax;

public class Square extends Figure implements FigureDetails{
    String name = String.valueOf(FigureE.SQUARE);
    private int side;

    public Square(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public void getArea() {
        System.out.println(side * side);
    }
    @Override
    public void getDetails() {
        System.out.print(color + " " + name + " with side " + side + " and area of ");
        getArea();
    }
}
