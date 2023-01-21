package fauna.implementations;

import components.implementations.LegArm;
import fauna.abstracts.specific.GrabberWalker;

import java.util.ArrayList;
import java.util.Arrays;

public class LeglessPerson extends GrabberWalker {
    public LeglessPerson(final LegArm legArm1, final LegArm legArm2) {
        super(new ArrayList<>(Arrays.asList(legArm1, legArm2)), new ArrayList<>(Arrays.asList(legArm1, legArm2)));
    }
}
