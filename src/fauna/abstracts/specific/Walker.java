package fauna.abstracts.specific;

import components.contracts.GrabbingComponent;
import components.contracts.WalkingComponent;
import fauna.abstracts.generic.Limbed;

import java.util.List;

public abstract class Walker extends Limbed {
    public Walker(List<GrabbingComponent> grabbingLimbs, List<WalkingComponent> walkingLimbs) {
        super(grabbingLimbs, walkingLimbs);
    }

    public void walk() {
        System.out.println("The " + this.getClass().getSimpleName() + " is going to walk!");
        for(WalkingComponent walkingComponent : this.getWalkingLimbs()) {
            walkingComponent.walk();
        }
    }
}
