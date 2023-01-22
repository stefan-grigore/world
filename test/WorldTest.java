import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorldTest {
  @Test
  void tests() {
    final ByteArrayOutputStream out = new ByteArrayOutputStream();
    World.main(new PrintStream(out));
    final String wanted = """
        I'm LegArm 1 of Squirrel sticking out! Look at me!
        I'm LegArm 2 of Squirrel sticking out! Look at me!
        I'm Leg 1 of Squirrel sticking out! Look at me!
        I'm Leg 2 of Squirrel sticking out! Look at me!
        The Squirrel has spawned!
        The Squirrel is going to walk!
        I'm LegArm 1 of Squirrel. I'm walking here!
        I'm LegArm 2 of Squirrel. I'm walking here!
        I'm Leg 1 of Squirrel. I'm walking here!
        I'm Leg 2 of Squirrel. I'm walking here!
        The Squirrel is going to grab!
        I'm LegArm 1 of Squirrel. I'm grabbing stuff!
        I'm LegArm 2 of Squirrel. I'm grabbing stuff!

        I'm Leg 1 of Dog sticking out! Look at me!
        I'm Leg 2 of Dog sticking out! Look at me!
        I'm Leg 3 of Dog sticking out! Look at me!
        I'm Leg 4 of Dog sticking out! Look at me!
        The Dog has spawned!
        The Dog is going to walk!
        I'm Leg 1 of Dog. I'm walking here!
        I'm Leg 2 of Dog. I'm walking here!
        I'm Leg 3 of Dog. I'm walking here!
        I'm Leg 4 of Dog. I'm walking here!

        I'm LegArm 1 of LeglessPerson sticking out! Look at me!
        I'm LegArm 2 of LeglessPerson sticking out! Look at me!
        The LeglessPerson has spawned!
        The LeglessPerson is going to walk!
        I'm LegArm 1 of LeglessPerson. I'm walking here!
        I'm LegArm 2 of LeglessPerson. I'm walking here!
        The LeglessPerson is going to grab!
        I'm LegArm 1 of LeglessPerson. I'm grabbing stuff!
        I'm LegArm 2 of LeglessPerson. I'm grabbing stuff!

        I'm Arm 1 of Stefan sticking out! Look at me!
        I'm Arm 2 of Stefan sticking out! Look at me!
        I'm LegArm 1 of Stefan sticking out! Look at me!
        I'm LegArm 2 of Stefan sticking out! Look at me!
        The Stefan has spawned!
        The Stefan is going to walk!
        I'm LegArm 1 of Stefan. I'm walking here!
        I'm LegArm 2 of Stefan. I'm walking here!
        The Stefan is going to grab!
        I'm Arm 1 of Stefan. I'm grabbing stuff!
        I'm Arm 2 of Stefan. I'm grabbing stuff!
        I'm LegArm 1 of Stefan. I'm grabbing stuff!
        I'm LegArm 2 of Stefan. I'm grabbing stuff!
        """;
    Assertions.assertEquals(wanted.replaceAll("\r", ""), out.toString().replaceAll("\r", ""));
  }
}
