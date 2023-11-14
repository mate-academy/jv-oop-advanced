package core.basesyntax;

public class Square extends Figure implements FigureInfo{
    private final double leg;
public Square(double leg,String color){
    super(color);
    this.leg = leg;
}


    @Override
    public double getArea() {
        return leg*leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure"+" "+"Square"+" "+"leg"+" "+leg+" "+"Area"+" "+getArea()+" ");

    }
}
