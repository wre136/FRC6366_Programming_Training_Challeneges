/**
 * RobotDiagnostics
 * FRC Team 6366 - RamRodz Robotics
 *
 * Tonight's topic: conditional operators and if / if-else / if-else-if-else
 *
 * The variables below simulate sensor readings coming from a robot during
 * a match. They are already declared and given values for you -- do not
 * change the values, and do not add any new variables.
 *
 * Your job is to write the conditional logic described in each TODO block.
 * Each TODO should print exactly one message to the console using
 * System.out.println(...). The message text is up to you, but it must
 * make it obvious which branch of your conditional ran (for example,
 * a message that clearly says whether the battery is fine or low).
 *
 * When you run this program, three lines should print to the terminal --
 * one for each TODO -- showing which branch your code chose based on the
 * sensor values below.
 */
public class RobotDiagnostics {
 
    public static void main(String[] args) {
 
        // --- Sensor data for this run (do not modify) ---
        double batteryVoltage = 11.4;      // volts
        double obstacleDistanceInches = 6.0; // inches from the front bumper
        int matchTimeRemainingSeconds = 25;  // seconds left in the match
 
        // ==========================================================
        // TODO 1: Simple IF statement (no else)
        //
        // Battery voltage below 11.5 volts is considered LOW.
        // If batteryVoltage is below 11.5, print a message warning
        // that the battery is low.
        //
        // If the condition is not true, nothing should print for
        // this section.
        // ==========================================================
 
 
 
        // ==========================================================
        // TODO 2: IF-ELSE statement
        //
        // The robot should treat anything closer than 12 inches as
        // "too close" to an obstacle. Write a conditional that:
        //   - prints one message if obstacleDistanceInches is less
        //     than 12 (the path is blocked)
        //   - otherwise prints a different message (the path is clear)
        //
        // Exactly one of the two messages should print.
        // ==========================================================
 
 
 
        // ==========================================================
        // TODO 3: IF-ELSE-IF-ELSE statement (three or more branches)
        //
        // The match clock has different phases based on time left:
        //   - 30 seconds or more remaining  -> still in regular play
        //   - less than 30 but at least 10  -> endgame warning
        //   - less than 10                  -> final countdown
        //
        // Write a conditional using matchTimeRemainingSeconds that
        // checks these three ranges (in order) and prints a distinct
        // message for whichever range applies.
        // ==========================================================
 
 
    }
}