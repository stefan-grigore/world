package components.implementations;

import components.abstracts.specific.WalkingLimb;

public class Leg extends WalkingLimb {

    private final int index;
    private final Class parentClass;

    public Leg(final int index, final Class parentClass) {
        super(index, parentClass);
        this.index = index;
        this.parentClass = parentClass;
    }

    @Override
    public void walk() {
        System.out.println("I'm " + this.getClass().getSimpleName() + " " + index + " of " + parentClass.getSimpleName() + ". I'm walking here!");
    }
}
