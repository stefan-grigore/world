package components.implementations;

import components.abstracts.specific.GrabbingLimb;

public class Arm extends GrabbingLimb {

    private final int index;

    public Arm(final int index, final Class parentClass) {
        super(index, parentClass);
        this.index = index;
    }
    @Override
    public void grab() {
        System.out.println("I'm " + this.getClass().getSimpleName() + " " + index + ". I'm grabbing stuff!");
    }
}
