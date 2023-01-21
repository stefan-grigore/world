package fauna.implementations;

import components.implementations.Arm;
import components.implementations.LegArm;
import fauna.abstracts.specific.GrabberWalker;

import java.util.ArrayList;
import java.util.Arrays;

public class Stefan extends GrabberWalker {
    public Stefan(final Arm arm1, final Arm arm2, final LegArm legArm1, final LegArm legArm2) {
        super(new ArrayList<>(
                Arrays.asList(arm1, arm2, legArm1, legArm2)),
                new ArrayList<>(Arrays.asList(legArm1, legArm2))
        );
    }
}
