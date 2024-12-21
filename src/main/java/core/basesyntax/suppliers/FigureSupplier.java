package core.basesyntax.suppliers;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {

    public Figure getDefaultFigure(){
        Figure circle = new Circle ( "white", 10 );
        return circle;
    };

    public Figure getRandomFigure(){
        ColorSupplier colorSupplier = new ColorSupplier ();
        String color = colorSupplier.getRandomColor ();
        Figure [] figures = new Figure[5];
        Random random = new Random (  );
        figures[0] = new Square ( color , random.nextInt (100 )  );
        figures[1] = new Circle ( color , random.nextInt (100 )  );
        figures[2] = new Rectangle ( color , random.nextInt (100 ), random.nextInt (100 ));
        figures[3] = new IsoscelesTrapezoid ( color , random.nextInt (100 ), random.nextInt (100 ), random.nextInt (100 )   );
        figures[4] = new RightTriangle ( color , random.nextInt (100 ), random.nextInt (100 )  );
        return figures[random.nextInt (figures.length)];
    };
}
