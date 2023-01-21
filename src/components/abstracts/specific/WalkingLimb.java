package components.abstracts.specific;

import components.abstracts.generic.Limb;
import components.contracts.WalkingComponent;

public abstract class WalkingLimb extends Limb implements WalkingComponent {
    public WalkingLimb(final int index, final Class parentClass) {
        super(index, parentClass);
    }
}
