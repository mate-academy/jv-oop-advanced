package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor(){
        String[] colors = new String[]{"white", "blue", "red", "blue", "yellow"};
        Random random = new Random (  );
        return colors[random.nextInt ( colors.length )];
    }
}
