package core.basesyntax;

import core.basesyntax.behavior.Draw;

public class Square extends Figure implements Draw, AreaCalculater {
    private double side;



    public Square(String color,double side) {
        this.color = color;
        this.side = side;
        area();
    }


    @Override
    public Figure draw() {

        return null;
    }

    @Override
    public void area() {
        area = side * side;
    }
}
