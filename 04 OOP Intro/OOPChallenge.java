// ════════════════════════════════════════════════════════════════════════
//  🏎️🔥  RamRodz Robotics — Team 6366
//  Programming Challenge: Intro to OOP — Objects & Classes
//
//  Name: _________________________________   Date: ____________________
//
//  Instructions:
//    - Read each challenge block carefully before writing any code.
//    - Challenges 1 & 2 are solved inside main (scroll down).
//    - Challenges 3, 4, & 6 are solved by editing the class shells above main.
//    - Challenge 5 (Fix the Bugs) is solved inside main.
//    - Do NOT delete or modify the TODO lines — write on the blank lines below them.
//    - You can run this file in an IDE to check your work.
// ════════════════════════════════════════════════════════════════════════


// ════════════════════════════════════════════════════════════════════════
//  PRE-WRITTEN CLASS — Read this carefully. You'll use it in Challenges 1 & 2.
// ════════════════════════════════════════════════════════════════════════

class Shooter {
    double speed;       // how fast the shooter motor is spinning
    boolean isRunning;  // is the shooter currently on?

    Shooter() {                    // constructor — sets starting values
        speed = 0.0;
        isRunning = false;
    }

    void spinUp() {                // method — turns the shooter on
        speed = 0.8;
        isRunning = true;
        System.out.println("Shooter spinning up!");
    }

    void stop() {                  // method — turns the shooter off
        speed = 0.0;
        isRunning = false;
        System.out.println("Shooter stopped.");
    }
}


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 3 — Add Fields to a Class
// ════════════════════════════════════════════════════════════════════════
//
//  The Intake class below is missing its fields.
//  A field is a variable that belongs to the class — declared inside the
//  class body but OUTSIDE any method.
//
//  TODO 3: Add two fields to the Intake class:
//            • A double named 'rollerSpeed'   (the roller motor — starts at 0.0)
//            • A boolean named 'isActive'     (is the intake running? — starts false)
//          Then update the constructor to set both fields to their starting values.

class Intake {

    // your fields go here ↓



    Intake() {
        // update the constructor to set your fields here ↓


    }
}
//  ── end challenge 3 ─────────────────────────────────────────────────────


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 4 — Write a Constructor
// ════════════════════════════════════════════════════════════════════════
//
//  The Climber class below has its fields declared but no constructor.
//  A constructor is a special method with the SAME NAME as the class.
//  It runs automatically when you create an object with 'new'.
//
//  TODO 4: Write the constructor for Climber.
//            • Set 'armPosition' to 0.0
//            • Set 'isDeployed' to false

class Climber {
    double armPosition;  // how far the arm has extended
    boolean isDeployed;  // has the climber been deployed?

    // your constructor goes here ↓



}
//  ── end challenge 4 ─────────────────────────────────────────────────────


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 6 — Write a Complete Class  🔥 Boss Level
// ════════════════════════════════════════════════════════════════════════
//
//  Design the Drivetrain class from scratch.
//
//  TODO 6a: Declare the Drivetrain class with these three fields:
//             • double leftSpeed    (left drive motor — starts at 0.0)
//             • double rightSpeed   (right drive motor — starts at 0.0)
//             • boolean isMoving    (is the robot driving? — starts false)
//
//  TODO 6b: Write the constructor.
//             Set all three fields to their starting values.
//
//  TODO 6c: Write a method named drive
//             - void, no parameters
//             - Sets leftSpeed and rightSpeed to 0.6
//             - Sets isMoving to true
//             - Prints "Drivetrain: moving forward!"
//
//  TODO 6d: Write a method named brake
//             - void, no parameters
//             - Sets leftSpeed and rightSpeed to 0.0
//             - Sets isMoving to false
//             - Prints "Drivetrain: stopped."

// your Drivetrain class goes here ↓



//  ── end challenge 6 (class definition) ──────────────────────────────────


// ════════════════════════════════════════════════════════════════════════
//  MAIN CLASS — Challenges 1, 2, and 5 are solved here (inside main).
// ════════════════════════════════════════════════════════════════════════

public class OOPChallenge {

    public static void main(String[] args) {


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 1 — Create an Object
        // ════════════════════════════════════════════════════════════════
        //
        //  A class is the blueprint. An object is the real thing built from it.
        //  To create an object:   ClassName variableName = new ClassName();
        //
        //  TODO 1: Create a Shooter object named 'myShooter' using the 'new' keyword.




        //  ── end challenge 1 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 2 — Use Dot Notation
        // ════════════════════════════════════════════════════════════════
        //
        //  Dot notation lets you reach inside an object:
        //    objectName.fieldName       ← read or change a field
        //    objectName.methodName()    ← call a method
        //
        //  TODO 2a: Use dot notation to call spinUp() on your myShooter object.


        //  TODO 2b: Use dot notation to print the value of myShooter's speed field.
        //           (Hint: System.out.println( myShooter.??? );)


        //  TODO 2c: Use dot notation to call stop() on your myShooter object.


        //  TODO 2d: Use dot notation to print the value of myShooter's isRunning field.


        //  ── end challenge 2 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 5 — Fix the Bugs
        // ════════════════════════════════════════════════════════════════
        //
        //  Each line below has a mistake. Leave the BUG line as a comment
        //  and write the corrected version on the blank line below it.

        //  BUG 5a:  Shooter s = Shooter();
        //  FIX:


        //  BUG 5b:  Shooter anotherShooter = new Shooter;
        //  FIX:


        //  BUG 5c:  (assume:  Shooter s2 = new Shooter();  already exists)
        //           double currentSpeed = Shooter.speed;
        //  FIX:


        //  BUG 5d:  (assume:  Shooter s3 = new Shooter();  already exists)
        //           s3.spinUp;
        //  FIX:


        //  BUG 5e:  class Intake {
        //               Shooter() { }       ← constructor name is wrong
        //           }
        //  FIX (write only the corrected constructor header line):


        //  ── end challenge 5 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 6 (continued) — Use Your Drivetrain Class
        // ════════════════════════════════════════════════════════════════
        //
        //  TODO 6e: Create a Drivetrain object named 'robot'.


        //  TODO 6f: Call drive() on your robot object.


        //  TODO 6g: Print robot.isMoving to see its current value.


        //  TODO 6h: Call brake() on your robot object.


        //  TODO 6i: Print robot.isMoving again to see that it changed.


        //  ── end challenge 6 ─────────────────────────────────────────────


    } // end main

} // end OOPChallenge
