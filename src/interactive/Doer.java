package interactive;

import components.Component;

import java.io.PrintStream;
import java.util.List;

public class Doer {
    private final List<Component> components;
    private final String name;
    private final PrintStream printStream;

    public Doer(final List<Component> components, final String name, final PrintStream printStream) {
        this.components = components;
        this.name = name;
        this.printStream = printStream;
        printStream.println("The " + name + " has spawned!");
    }

    public void execute(final String command) {
        printStream.println("The " + name + " is going to " + command + "!");
        for(final Component component: components) {
            component.execute(command);
        }
    }
}
