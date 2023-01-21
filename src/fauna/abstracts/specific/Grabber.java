package fauna.abstracts.specific;

import components.contracts.GrabbingComponent;
import components.contracts.WalkingComponent;
import fauna.abstracts.generic.Limbed;

import java.util.List;

public abstract class Grabber extends Limbed {
    public Grabber(List<GrabbingComponent> grabbingLimbs, List<WalkingComponent> walkingLimbs) {
        super(grabbingLimbs, walkingLimbs);
    }

    public void grab() {
        System.out.println("The " + this.getClass().getSimpleName() + " is going to grab!");
        for(GrabbingComponent grabbingComponent : this.getGrabbingLimbs()) {
            grabbingComponent.grab();
        }
    }
}
