package components.abstracts.specific;

import components.abstracts.generic.Limb;
import components.contracts.GrabbingComponent;
import components.contracts.WalkingComponent;

public abstract class GrabbingWalkingLimb extends Limb implements GrabbingComponent, WalkingComponent {
    public GrabbingWalkingLimb(final int index, final Class parentClass) {
        super(index, parentClass);
    }
}
