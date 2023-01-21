package fauna.implementations;

import components.implementations.Leg;
import components.implementations.LegArm;
import fauna.abstracts.specific.GrabberWalker;

import java.util.ArrayList;
import java.util.Arrays;

public class Squirrel extends GrabberWalker {
    public Squirrel(final LegArm legArm1, final LegArm legArm2, final Leg leg1, final Leg leg2) {
        super(new ArrayList<>(Arrays.asList(legArm1, legArm2)),
                new ArrayList<>(Arrays.asList(legArm1, legArm2, leg1, leg2)));
    }
}
