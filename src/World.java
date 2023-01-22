import components.Component;
import components.ComponentFactory;
import interactive.Doer;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World {
    public static void main(final String[] args) {
        final PrintStream printStream = System.out;
        main(printStream);
    }

    static void main(final PrintStream printStream) {
        final Component baseLegArm = ComponentFactory.createComponent("LegArm", 1, "",
                new ArrayList<>(Arrays.asList("walk", "grab")),
                new ArrayList<>(Arrays.asList("I'm walking here!", "I'm grabbing stuff!")),
                printStream
        );
        final Component baseLeg = ComponentFactory.createComponent("Leg", 1, "",
                new ArrayList<>(List.of("walk")),
                new ArrayList<>(List.of("I'm walking here!")),
                printStream
        );
        final Component baseArm = ComponentFactory.createComponent("Arm", 1, "",
                new ArrayList<>(List.of("grab")),
                new ArrayList<>(List.of("I'm grabbing stuff!")),
                printStream
        );
        String currentDoer = "Squirrel";
        final Doer squirrel = new Doer(new ArrayList<>(List.of(
                ComponentFactory.createComponent(baseLegArm, 1, currentDoer),
                ComponentFactory.createComponent(baseLegArm, 2, currentDoer),
                ComponentFactory.createComponent(baseLeg, 1, currentDoer),
                ComponentFactory.createComponent(baseLeg, 2, currentDoer)
        )), currentDoer, printStream);
        squirrel.execute("walk");
        squirrel.execute("grab");
        printStream.println();
        currentDoer = "Dog";
        final Doer dog = new Doer(new ArrayList<>(List.of(
                ComponentFactory.createComponent(baseLeg, 1, currentDoer),
                ComponentFactory.createComponent(baseLeg, 2, currentDoer),
                ComponentFactory.createComponent(baseLeg, 3, currentDoer),
                ComponentFactory.createComponent(baseLeg, 4, currentDoer)
        )), currentDoer, printStream);
        dog.execute("walk");
        printStream.println();
        currentDoer = "LeglessPerson";
        final Doer leglessPerson = new Doer(new ArrayList<>(List.of(
                ComponentFactory.createComponent(baseLegArm, 1, currentDoer),
                ComponentFactory.createComponent(baseLegArm, 2, currentDoer)
        )), currentDoer, printStream);
        leglessPerson.execute("walk");
        leglessPerson.execute("grab");
        printStream.println();
        currentDoer = "Stefan";
        final Doer stefan = new Doer(new ArrayList<>(List.of(
                ComponentFactory.createComponent(baseArm, 1, currentDoer),
                ComponentFactory.createComponent(baseArm, 2, currentDoer),
                ComponentFactory.createComponent(baseLegArm, 1, currentDoer),
                ComponentFactory.createComponent(baseLegArm, 2, currentDoer)
        )), currentDoer, printStream);
        stefan.execute("walk");
        stefan.execute("grab");
    }
}