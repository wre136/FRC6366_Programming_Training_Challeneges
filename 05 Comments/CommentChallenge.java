// ════════════════════════════════════════════════════════════════════════
//  🏎️🔥  RamRodz Robotics — Team 6366
//  Programming Challenge: Comments
//
//  Name: _________________________________   Date: ____________________
//
//  Instructions:
//    - Read each challenge block carefully before writing anything.
//    - Write your answers on the blank lines below each TODO comment.
//    - Challenges 1–5 are solved inside main (scroll down).
//    - Challenge 6 is solved by adding comments to the Climber class ABOVE main.
//    - Do NOT delete or modify the TODO lines — write on the blank lines below them.
//    - You can run this file in an IDE, but challenges 1–5 are comment-writing
//      exercises — the code runs as-is; your job is to add or fix the comments.
// ════════════════════════════════════════════════════════════════════════


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 6 — Full Documentation  🔥 Boss Level
//  (Instructions are at the bottom of the file in main)
//
//  This Climber class has ZERO comments. Scroll down to Challenge 6 first
//  to read the instructions, then come back here to add your comments.
// ════════════════════════════════════════════════════════════════════════

class Climber {

    double armPosition;
    boolean isDeployed;
    int port;
    String status;

    Climber() {
        armPosition = 0.0;
        isDeployed = false;
        port = 5;
        status = "Idle";
    }

    void deploy(double position) {
        armPosition = position;
        isDeployed = true;
        status = "Deployed";
        System.out.println("Climber deployed to: " + armPosition);
    }

    void retract() {
        armPosition = 0.0;
        isDeployed = false;
        status = "Retracted";
        System.out.println("Climber retracted.");
    }
}

//  ── end challenge 6 class ───────────────────────────────────────────────


public class CommentChallenge {

    public static void main(String[] args) {


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 1 — Identify the Comment Types
        // ════════════════════════════════════════════════════════════════
        //
        //  The code block below uses all three comment types.
        //  Read each labeled comment and write which type it is on the
        //  blank line below it:   //   or   /* */   or   /** */
        //
        //  ┌─────────────────────────────────────────────────────────────┐
        //  │  /* Shooter Subsystem — controls the shooter motor          │
        //  │     during the teleop phase of the match. */               │
        //  └─────────────────────────────────────────────────────────────┘
        //  TODO 1a: What type of comment is the block above?


        //  ┌─────────────────────────────────────────────────────────────┐
        //  │  double shooterSpeed = 0.0;  // starts stopped at 0%       │
        //  └─────────────────────────────────────────────────────────────┘
        //  TODO 1b: What type of comment appears after the semicolon?


        //  ┌─────────────────────────────────────────────────────────────┐
        //  │  /**                                                        │
        //  │   * Spins the shooter up to the requested speed.           │
        //  │   * @param speed  target speed from 0.0 to 1.0             │
        //  │   * @return       true if the shooter reached speed         │
        //  │   */                                                        │
        //  └─────────────────────────────────────────────────────────────┘
        //  TODO 1c: What type of comment is the block above?


        //  TODO 1d: What do the @param and @return tags describe?
        //           (Answer in plain English — not code)


        //  ── end challenge 1 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 2 — Add Single-Line Comments
        // ════════════════════════════════════════════════════════════════
        //
        //  The four lines below have NO comments.
        //  TODO 2: Add a // comment to the END of each line explaining what
        //          the variable stores or what the line does.
        //          Write your comment on the blank line directly below each one.
        //          (You'd add it to the end of the variable line in real code —
        //           writing it on the next line here shows your work.)

        double driveSpeed = 0.0;
        //

        boolean isAutonomous = false;
        //

        int ballCount = 0;
        //

        String autoRoutine = "Not Selected";
        //

        //  ── end challenge 2 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 3 — Write a Multi-Line Comment
        // ════════════════════════════════════════════════════════════════
        //
        //  The code block below controls the robot's drivetrain.
        //  It has no header comment explaining what it is.
        //
        //  TODO 3: Write a /* */ multi-line comment in the space below that
        //          describes this code block. Include:
        //            • What subsystem this is
        //            • What the variables track
        //            • Your name as the author

        //  (write your multi-line comment on the blank lines below)




        double leftSpeed = 0.0;
        double rightSpeed = 0.0;
        boolean isDriving = false;

        //  ── end challenge 3 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 4 — Write a Javadoc Comment
        // ════════════════════════════════════════════════════════════════
        //
        //  The method signature below describes what the method does:
        //
        //    setShooterSpeed(double speed)
        //      - void (no return value)
        //      - Takes one parameter: a double named 'speed' (range 0.0 to 1.0)
        //      - Sets the shooter motor to the requested speed
        //      - Prints "Shooter speed set to: " followed by the speed value
        //
        //  TODO 4: Write a complete Javadoc comment for this method.
        //          Include:
        //            • A one-sentence description of what it does
        //            • An @param tag for 'speed'
        //          (Because the return type is void, you do NOT need @return.)
        //
        //  Write your Javadoc on the blank lines below — start with /**

        /**




         */
        //  ↑ your Javadoc goes between the /** and */

        //  ── end challenge 4 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 5 — Fix the Bugs
        // ════════════════════════════════════════════════════════════════
        //
        //  Each comment below has a mistake that makes it wrong or broken.
        //  Leave the BUG line as a comment and write the corrected version
        //  on the blank line directly below it.

        //  BUG 5a:  \\ This was supposed to be a single-line comment
        //  FIX:


        //  BUG 5b:  /* This block comment is never closed
        //           double intakeSpeed = 0.5;
        //  FIX (write the corrected opening line — add what's missing):


        //  BUG 5c:  */ This block comment has its markers backwards /*
        //  FIX:


        //  BUG 5d:  ** @param speed the motor speed from 0.0 to 1.0 */
        //           (Meant to be a Javadoc comment — the opening is wrong)
        //  FIX:


        //  BUG 5e:  @param position  the arm position in degrees
        //           (This @param tag is floating in the code — not inside any comment)
        //  FIX (wrap it so it becomes a valid Javadoc comment):


        //  ── end challenge 5 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 6 — Fully Document the Climber Class  🔥 Boss Level
        // ════════════════════════════════════════════════════════════════
        //
        //  Scroll UP to the Climber class at the top of this file.
        //  It has zero comments. Add ALL of the following:
        //
        //  TODO 6a: Write a /* */ multi-line comment at the very top of the
        //           Climber class (above the class keyword) that describes:
        //             • What the Climber class represents
        //             • What the robot uses it for
        //
        //  TODO 6b: Write a /** */ Javadoc comment directly above the class
        //           keyword itself. Include:
        //             • A one-sentence description
        //             • @author  RamRodz — Team 6366
        //
        //  TODO 6c: Add a // comment to the END of each of the four field lines
        //           (armPosition, isDeployed, port, status) explaining what
        //           each field stores.
        //
        //  TODO 6d: Write a /** */ Javadoc comment above the constructor.
        //           (No parameters — just a one-sentence description.)
        //
        //  TODO 6e: Write a /** */ Javadoc above the deploy() method.
        //           Include a one-sentence description and an @param tag
        //           for 'position'.
        //
        //  TODO 6f: Write a /** */ Javadoc above the retract() method.
        //           (No parameters — just a one-sentence description.)
        //
        //  When you're done, scroll back down here and run the program
        //  to confirm it still compiles.

        Climber myClimber = new Climber();
        myClimber.deploy(45.0);
        myClimber.retract();

        //  ── end challenge 6 ─────────────────────────────────────────────


    } // end main

} // end CommentChallenge
