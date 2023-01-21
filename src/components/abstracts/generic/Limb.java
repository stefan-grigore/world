package components.abstracts.generic;

public abstract class Limb {
    public Limb(final int index, final Class parentClass) {
        System.out.println("I'm " + this.getClass().getSimpleName() + " " + index + " of " + parentClass.getSimpleName() + " sticking out! Look at me!");
    }
}
