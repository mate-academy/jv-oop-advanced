package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] listOfFigures = {new Circle("white",10),new Rectangle("red",5,5),
                                  new IsoscelesTrapezoid("red",3,3,3), new Square("black",2),
                                  new RightTriangle("yellow",4,4)};

        for (Figure el : listOfFigures) {
            el.draw();
        }
    }

}
