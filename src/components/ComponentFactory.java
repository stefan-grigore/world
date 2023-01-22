package components;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ComponentFactory {
    public static Component createComponent(final String type, final int index, final String parent, final List<String> commands, final List<String> outputs, final PrintStream printStream) {
        final Map<String, Consumer<Void>> capabilities = new HashMap<>();
        for(int commandIndex=0; commandIndex<commands.size(); commandIndex++) {
            final int finalCommandIndex = commandIndex;
            capabilities.put(commands.get(finalCommandIndex), (Void input) -> printStream.println("I'm " + type + " " + index + " of " + parent + ". " + outputs.get(finalCommandIndex)));
        }
        return new Component(type, index, parent, capabilities, commands, outputs, printStream);
    }

    public static Component createComponent(final Component component, final int index, final String parent) {
        return ComponentFactory.createComponent(component.getType(), index, parent, component.getCommands(), component.getOutputs(), component.getPrintStream());
    }
}
