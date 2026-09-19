// ════════════════════════════════════════════════════════════════════════
//  🏎️🔥  RamRodz Robotics — Team 6366
//  Programming Challenge: Methods (Functions)
//
//  Name: _________________________________   Date: ____________________
//
//  Instructions:
//    - Read each challenge block carefully before writing any code.
//    - Write your answers in the space provided below each TODO comment.
//    - Do NOT delete or modify the TODO lines — write on the blank lines below them.
//    - Methods declared OUTSIDE main go in the section marked with arrows (↓↓↓).
//    - You can run this file in an IDE to check your work, but fix
//      compile errors one challenge at a time.
// ════════════════════════════════════════════════════════════════════════

public class MethodChallenge {


    // ▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼
    //  DECLARE YOUR METHODS HERE  (outside main — challenges 2, 3, 4, 6)
    // ▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲

    //  A method is already written below to get you started.
    //  Read it carefully — you'll call it in Challenge 1.

    static void printRobotReady() {
        System.out.println("Robot is ready!");
    }

    //  ── your methods go below this line ──────────────────────────────




    //  ── your methods go above this line ──────────────────────────────


    public static void main(String[] args) {


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 1 — Call an Existing Method
        // ════════════════════════════════════════════════════════════════
        //
        //  The method printRobotReady() is already written above.
        //  It prints "Robot is ready!" to the console.
        //
        //  TODO 1: Call printRobotReady() below so it actually runs.
        //          Hint: just write the method name followed by () and a semicolon.




        //  ── end challenge 1 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 2 — Write a void Method (no return value)
        // ════════════════════════════════════════════════════════════════
        //
        //  The robot's shooter needs a method that prints its current status.
        //
        //  Go UP to the methods section (outside main) and:
        //
        //    TODO 2a: Write a method named printShooterStatus
        //             - Return type: void  (it prints, it does NOT return a value)
        //             - No parameters
        //             - Body: print the message "Shooter status: Idle"
        //
        //  Then come back here:
        //
        //    TODO 2b: Call printShooterStatus() below.




        //  ── end challenge 2 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 3 — Write a Method That Returns a Value
        // ════════════════════════════════════════════════════════════════
        //
        //  The robot needs a method that calculates safe motor speed.
        //  It should always return the value 0.75 (the max safe speed).
        //
        //  Go UP to the methods section and:
        //
        //    TODO 3a: Write a method named getMaxSpeed
        //             - Return type: double  (it GIVES BACK a decimal number)
        //             - No parameters
        //             - Body: return 0.75
        //
        //  Then come back here:
        //
        //    TODO 3b: Call getMaxSpeed() and store its return value in a
        //             double variable named 'safeSpeed'.
        //             Then print safeSpeed to the console.




        //  ── end challenge 3 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 4 — Methods with Parameters
        // ════════════════════════════════════════════════════════════════
        //
        //  Parameters let you pass information INTO a method when you call it.
        //
        //  Go UP to the methods section and:
        //
        //    TODO 4a: Write a method named setDriveSpeed
        //             - Return type: void
        //             - One parameter: a double named 'speed'
        //             - Body: print "Drive speed set to: " followed by the speed value
        //               (use concatenation — "Drive speed set to: " + speed)
        //
        //  Then come back here:
        //
        //    TODO 4b: Call setDriveSpeed() TWO times below:
        //             - Once with the value 0.5  (half speed)
        //             - Once with the value 1.0  (full speed)




        //  ── end challenge 4 ─────────────────────────────────────════════


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 5 — Fix the Bugs
        // ════════════════════════════════════════════════════════════════
        //
        //  Each line (or group of lines) below has a mistake.
        //  Read the broken code, figure out what's wrong, and write the
        //  CORRECTED version on the blank line directly below it.
        //
        //  Do not delete the BUG line — leave it as a comment.

        //  BUG 5a:  void printStatus()    ← called like this: printStatus()
        //           The method header is missing the keyword that belongs
        //           before the return type in this file.
        //  FIX (write the corrected method header — just the first line):


        //  BUG 5b:  static double getSpeed() {
        //               return "fast";
        //           }
        //  FIX (write only the corrected return statement):


        //  BUG 5c:  static void fireNote() {
        //               System.out.println("Firing!");
        //           }
        //           ...called like this:  double result = fireNote();
        //  FIX (write the corrected call line — fix how it is being called):


        //  BUG 5d:  static int countPieces(int scored) {
        //               return scored;
        //           }
        //           ...called like this:  countPieces();
        //  FIX (write the corrected call line):


        //  BUG 5e:  static void resetRobot() {
        //               System.out.println("Resetting...");
        //           }
        //           ...called like this:  void resetRobot();
        //  FIX (write the corrected call line):


        //  ── end challenge 5 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 6 — Full Intake Method Set  🔥 Boss Level
        // ════════════════════════════════════════════════════════════════
        //
        //  The intake subsystem needs a complete set of methods.
        //  Go UP to the methods section and write ALL of the following:
        //
        //    TODO 6a: Write a method named startIntake
        //             - void, no parameters
        //             - Prints "Intake: ON — speed 0.65"
        //
        //    TODO 6b: Write a method named stopIntake
        //             - void, no parameters
        //             - Prints "Intake: OFF — speed 0.0"
        //
        //    TODO 6c: Write a method named isIntakeRunning
        //             - Return type: boolean
        //             - No parameters
        //             - For now, just return true
        //               (pretend the intake is running)
        //
        //    TODO 6d: Write a method named buildIntakeReport
        //             - Return type: String
        //             - One parameter: a double named 'currentSpeed'
        //             - Returns the String: "Intake | Speed: " + currentSpeed
        //               (use concatenation — do NOT print, return it)
        //
        //  Then come back here:
        //
        //    TODO 6e: Call all four methods below in order.
        //             - Call startIntake()
        //             - Call stopIntake()
        //             - Declare a boolean named 'running' — store the
        //               return value of isIntakeRunning()
        //             - Declare a String named 'report' — store the
        //               return value of buildIntakeReport(0.65)
        //             - Print both 'running' and 'report' to the console




        //  ── end challenge 6 ─────────────────────────────────────────────


    } // end main

} // end MethodChallenge
