package components.implementations;

import components.abstracts.specific.GrabbingWalkingLimb;

public class LegArm extends GrabbingWalkingLimb {

    private final int index;
    private final Class parentClass;

    public LegArm(final int index, final Class parentClass) {
        super(index, parentClass);
        this.index = index;
        this.parentClass = parentClass;
    }
    
    @Override
    public void grab() {
        System.out.println("I'm " + this.getClass().getSimpleName() + " " + index + ". I'm grabbing stuff!");

    }

    @Override
    public void walk() {
        System.out.println("I'm " + this.getClass().getSimpleName() + " " + index + " of " + parentClass.getSimpleName() + ". I'm walking here!");
    }
}
