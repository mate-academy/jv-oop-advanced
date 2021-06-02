package core.basesyntax;

public class Square extends Figure implements Draw{
    private double side;



    public Square(String color,double side){
        this.color = color;
        this.side = side;
    }


    @Override
    public void draw() {

    }
}
