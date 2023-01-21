package fauna.abstracts.generic;

import components.contracts.GrabbingComponent;
import components.contracts.WalkingComponent;

import java.util.List;

public abstract class Limbed {
    private List<GrabbingComponent> grabbingLimbs;
    private List<WalkingComponent> walkingLimbs;

    public Limbed(final List<GrabbingComponent> grabbingLimbs, final List<WalkingComponent> walkingLimbs){
        this.grabbingLimbs = grabbingLimbs;
        this.walkingLimbs = walkingLimbs;
        System.out.println("The " + this.getClass().getSimpleName() + " has spawned!");
    }

    public List<GrabbingComponent> getGrabbingLimbs() {
        return grabbingLimbs;
    }

    public List<WalkingComponent> getWalkingLimbs() {
        return walkingLimbs;
    }
}
