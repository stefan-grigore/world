package components;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Component {

    private final String type;
    private final String parent;
    private final Map<String, Consumer<Void>> capabilitiesByCommand;

    private final List<String> commands;
    private final List<String> outputs;
    private final PrintStream printStream;

    public Component(final String type,
                     final int index,
                     final String parent,
                     final Map<String, Consumer<Void>> capabilitiesByCommand,
                     final List<String> commands,
                     final List<String> outputs,
                     final PrintStream printStream) {
        this.type = type;
        this.parent = parent;
        this.capabilitiesByCommand = capabilitiesByCommand;
        this.commands = commands;
        this.outputs = outputs;
        this.printStream = printStream;
        if(!parent.isEmpty()) {
            printStream.println("I'm " + type + " " + index + " of " + parent + " sticking out! Look at me!");
        }
    }

    public void execute(final String command) {
        if(capabilitiesByCommand.containsKey(command)) {
            capabilitiesByCommand.get(command).accept(null);
        }
    }

    public String getType() {
        return type;
    }

    public String getParent() {
        return parent;
    }

    public List<String> getCommands() {
        return commands;
    }

    public List<String> getOutputs() {
        return outputs;
    }

    public PrintStream getPrintStream() {
        return printStream;
    }
}
