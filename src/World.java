import components.implementations.Arm;
import components.implementations.Leg;
import components.implementations.LegArm;
import fauna.implementations.Dog;
import fauna.implementations.LeglessPerson;
import fauna.implementations.Squirrel;
import fauna.implementations.Stefan;

public class World {
    public static void main(String[] args) {
        final Squirrel squirrel = new Squirrel(
                new LegArm(1, Squirrel.class),
                new LegArm(2, Squirrel.class),
                new Leg(1, Squirrel.class),
                new Leg(2, Squirrel.class)
        );
        squirrel.walk();
        squirrel.grab();
        System.out.println();
        final Dog dog = new Dog(
                new Leg(1, Dog.class),
                new Leg(2, Dog.class),
                new Leg(3, Dog.class),
                new Leg(4, Dog.class)
        );
        dog.walk();
        System.out.println();
        final LeglessPerson leglessPerson = new LeglessPerson(
                new LegArm(1, LeglessPerson.class),
                new LegArm(2, LeglessPerson.class)
        );
        leglessPerson.walk();
        leglessPerson.grab();
        System.out.println();
        final Stefan stefan = new Stefan(
                new Arm(1, Stefan.class),
                new Arm(2, Stefan.class),
                new LegArm(1, Stefan.class),
                new LegArm(2, Stefan.class)
        );
        stefan.walk();
        stefan.grab();
    }
}