package fauna.implementations;

import components.implementations.Leg;
import fauna.abstracts.specific.Walker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dog extends Walker {
    public Dog(final Leg leg1, final Leg leg2, final Leg leg3, final Leg leg4) {
        super(Collections.emptyList(), new ArrayList<>(Arrays.asList(leg1, leg2, leg3, leg4)));
    }
}
