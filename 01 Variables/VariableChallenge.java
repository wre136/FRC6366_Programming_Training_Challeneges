// ════════════════════════════════════════════════════════════════════════
//  🏎️🔥  RamRodz Robotics — Team 6366
//  Programming Challenge: Variables & Data Types
//
//  Name: _________________________________   Date: ____________________
//
//  Instructions:
//    - Read each challenge block carefully before writing any code.
//    - Write your answers in the space provided below each TODO comment.
//    - Do NOT delete or modify the TODO lines — write on the blank lines below them.
//    - You can run this file in an IDE to check your work, but fix
//      compile errors one challenge at a time.
// ════════════════════════════════════════════════════════════════════════

public class VariableChallenge {

    public static void main(String[] args) {


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 1 — Declare the Variables
        // ════════════════════════════════════════════════════════════════
        //
        //  The robot's intake system needs three variables to start up:
        //
        //    • The roller motor's speed (a decimal number — starts at 0.0, stopped)
        //    • Whether the intake button is currently pressed (true/false — starts as not pressed)
        //    • The intake motor's port number (a whole number — it is on port 2)
        //
        //  TODO 1: Declare all three variables below with the correct types and starting values.
        //          Give each variable a clear, descriptive name using camelCase.

        
        
        // Replace the "placeholder" words in the below print line statements with the variables
        // you created above.
        System.out.println("Roller Motor Speed: " + placeholder);
        System.out.println("Intake Button Pressed: " + placeholder);
        System.out.println("Intake Motor Port: " + placeholder);

        //  ── end challenge 1 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 2 — Reassign the Variables
        // ════════════════════════════════════════════════════════════════
        //
        //  The driver just pressed the intake button and the roller is now spinning.
        //  Update the variables you declared in Challenge 1:
        //
        //    • Set the motor speed to 65% power  (hint: 65% = 0.65 as a decimal)
        //    • Mark the intake button as pressed
        //
        //  TODO 2: Write the two reassignment lines below.
        //          Remember: do NOT write the type keyword (double, boolean, etc.) again —
        //          you already declared these variables above.



        // Replace the "placeholder" words in the below print line statements with the variables
        // you created above.
        System.out.println("Roller Motor Speed: " + placeholder);
        System.out.println("Intake Button Pressed: " + placeholder);

        //  ── end challenge 2 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 3 — String Variables
        // ════════════════════════════════════════════════════════════════

        //  TODO 3a: Declare a String variable named 'intakeStatus'.
        //           Start it with the message "Idle" (the intake hasn't turned on yet).
        
        
        
        System.out.println("Intake Motor Status: " + intakeStatus);
        
        
        //  TODO 3b: The intake motor just turned on.
        //           Reassign 'intakeStatus' to the message "Running".
        //           (Do NOT write the type keyword String again.)
        
        
        System.out.println("Intake Motor Status: " + intakeStatus);

        //  TODO 3c: Declare a String named 'speedReport' that uses concatenation (+)
        //           to combine the label "Intake speed: " with the motor speed variable
        //           you declared in Challenge 1.
        //           Example — if the speed is 0.65, speedReport should hold: "Intake speed: 0.65"
        
        
        
        System.out.println(speedReport);
        
        // Replace the "placeholder" words in the below print line statements with the variables
        // you created above.
        System.out.println("Roller Motor Speed: " + placeholder);
        System.out.println("Intake Button Pressed: " + placeholder);
        
        //  ── end challenge 3 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 4 — Fix the Bugs
        // ════════════════════════════════════════════════════════════════
        //
        //  Each line below has a mistake that would stop the code from compiling.
        //  Read the broken line, figure out what's wrong, and write the CORRECTED
        //  version on the blank line directly below it.
        //
        //  Do not delete the BUG line — leave it as a comment so your instructor
        //  can see what you started with.

        //  BUG 4a:  double shooterSpeed = true;
        //  FIX:


        //  BUG 4b:  int ballCount = 2.5;
        //  FIX:


        //  BUG 4c:  boolean isRunning = 1;
        //  FIX:


        //  BUG 4d:  String autoMode = DriveForward;
        //  FIX:


        //  BUG 4e:  int motorPort = 0;
        //           motorPort = 1.0;
        //  FIX (write the corrected reassignment line only):


        //  ── end challenge 4 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 5 — Choose the Right Type
        // ════════════════════════════════════════════════════════════════
        //
        //  For each situation below, declare a variable with the correct type
        //  and a sensible starting value. Choose the variable name yourself —
        //  make it descriptive.

        //  TODO 5a: The name of the autonomous routine the robot will run
        //           (it's text — start it as "Not Selected")


        //  TODO 5b: The speed of the left drive motor
        //           (needs a decimal — start it stopped)


        //  TODO 5c: Whether the robot has crossed the start line yet
        //           (yes or no — it hasn't yet)


        //  TODO 5d: The number of game pieces the robot has scored this match
        //           (a whole number — none yet)


        //  TODO 5e: The port number the gyro sensor is connected to
        //           (a whole number — it is on port 1)


        //  ── end challenge 5 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 6 — Full Shooter Setup  🔥 Boss Level
        // ════════════════════════════════════════════════════════════════
        //
        //  Declare ALL of the starting variables the shooter subsystem needs:
        //
        //    • The shooter motor speed       (decimal, starts stopped)
        //    • Whether the shooter is on     (true/false, starts off)
        //    • The shooter motor's port      (whole number, port 4)
        //    • A dashboard status message    (String, starts as "Shooter Off")
        //
        //  TODO 6a: Declare all four variables below.




        //  Now the driver pressed the fire button and the shooter spun up.
        //
        //  TODO 6b: Write the four reassignment lines to update all four variables
        //           so the speed is 0.80, the shooter is on, and the message is "Shooter Running".
        //           The port number does NOT change — do not reassign it.




        //  TODO 6c: Build a String named 'shooterReport' using concatenation.
        //           It should combine the label "Shooter | Speed: " with the speed variable,
        //           then " | Status: " then the status message variable.
        //           Example result: "Shooter | Speed: 0.8 | Status: Shooter Running"


        //  ── end challenge 6 ─────────────────────────────────────────────


    } // end main

} // end VariableChallenge
