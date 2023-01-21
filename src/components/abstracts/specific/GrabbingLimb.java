package components.abstracts.specific;

import components.abstracts.generic.Limb;
import components.contracts.GrabbingComponent;

public abstract class GrabbingLimb extends Limb implements GrabbingComponent {
    public GrabbingLimb(final int index, final Class parentClass) {
        super(index, parentClass);
    }
}
