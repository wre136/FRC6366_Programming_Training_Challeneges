// ════════════════════════════════════════════════════════════════════════
//  🏎️🔥  RamRodz Robotics — Team 6366
//  Programming Challenge: Intro to WPILib — Controllers & Motors
//
//  Name: _________________________________   Date: ____________________
//
//  Instructions:
//    - Read each challenge block carefully before writing any code.
//    - Write your answers in the space provided below each TODO comment.
//    - Do NOT delete or modify the TODO lines — write on the blank lines below them.
//    - All challenges are solved inside main (scroll down).
//    - NOTE: This file uses STUB classes at the top to simulate WPILib so it
//      compiles in a standard Java IDE. In a real FRC project these stubs are
//      replaced by WPILib library imports.
//    - You can run this file in an IDE to see your motor/controller calls print.
// ════════════════════════════════════════════════════════════════════════


// ════════════════════════════════════════════════════════════════════════
//  STUB CLASSES — These simulate WPILib + Phoenix 6 for this exercise.
//  Do NOT edit these. In a real robot project, imports replace these stubs.
// ════════════════════════════════════════════════════════════════════════

class XboxController {
    int port;
    XboxController(int port) {
        this.port = port;
        System.out.println("XboxController created on USB port " + port);
    }
    double getLeftY()        { return  0.75; }
    double getLeftX()        { return  0.00; }
    double getRightY()       { return -0.50; }
    double getRightX()       { return  0.25; }
    boolean getAButton()     { return true;  }
    boolean getBButton()     { return false; }
    boolean getLeftBumper()  { return false; }
    boolean getRightBumper() { return true;  }
}

class PWMSparkMax {
    int port;
    PWMSparkMax(int port) {
        this.port = port;
        System.out.println("PWMSparkMax motor controller created on PWM port " + port);
    }
    void set(double speed) {
        System.out.println("  PWMSparkMax port " + port + " → speed: " + speed);
    }
}

class TalonFX {
    int deviceId;
    TalonFX(int deviceId) {
        this.deviceId = deviceId;
        System.out.println("TalonFX created with CAN device ID " + deviceId);
    }
    void set(double speed) {
        System.out.println("  TalonFX ID " + deviceId + " → speed: " + speed);
    }
}

//  ── end stubs ───────────────────────────────────────────────────────────


public class WPILibChallenge {

    public static void main(String[] args) {


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 1 — Read the Code
        // ════════════════════════════════════════════════════════════════
        //
        //  Study the three lines below, then answer the questions.
        //
        //  ┌─────────────────────────────────────────────────────────────┐
        //  │  XboxController driver = new XboxController(0);            │
        //  │  PWMSparkMax leftDrive = new PWMSparkMax(3);               │
        //  │  leftDrive.set( driver.getLeftY() );                       │
        //  └─────────────────────────────────────────────────────────────┘

        //  TODO 1a: What does the 0 in new XboxController(0) represent?
        //           (Hint: it's not a speed or position)


        //  TODO 1b: What does the 3 in new PWMSparkMax(3) represent?


        //  TODO 1c: What does driver.getLeftY() return?
        //           (What data type? What range of values?)


        //  TODO 1d: In plain English, what does the third line do?
        //           (Explain the whole leftDrive.set( driver.getLeftY() ) in one sentence)


        //  ── end challenge 1 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 2 — Write Import Statements
        // ════════════════════════════════════════════════════════════════
        //
        //  In a real FRC project, WPILib and Phoenix 6 classes are brought
        //  in at the TOP of the file with import statements.
        //
        //  Each import follows this pattern:
        //    import <package.path.ClassName>;
        //
        //  Package paths for reference:
        //    XboxController →  edu.wpi.first.wpilibj
        //    PWMSparkMax    →  edu.wpi.first.wpilibj.motorcontrol
        //    TalonFX        →  com.ctre.phoenix6.hardware
        //
        //  TODO 2a: Write the import statement for XboxController.
        //           (Write your answer as a comment on the blank line below)


        //  TODO 2b: Write the import statement for PWMSparkMax.


        //  TODO 2c: Write the import statement for TalonFX.


        //  ── end challenge 2 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 3 — Declare Objects
        // ════════════════════════════════════════════════════════════════
        //
        //  Create (declare) each object described below using 'new'.
        //  Pattern:   ClassName variableName = new ClassName(argument);

        //  TODO 3a: Create an XboxController named 'operator' on USB port 1.


        //  TODO 3b: Create a PWMSparkMax named 'intake' on PWM port 4.


        //  TODO 3c: Create a TalonFX named 'elevator' with CAN device ID 7.


        //  ── end challenge 3 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 4 — Wire Controller to Motor
        // ════════════════════════════════════════════════════════════════
        //
        //  The objects below already exist — use them to complete each task.
        //
        //  (These are the stub-simulated objects for this challenge)
        XboxController driver4 = new XboxController(0);
        PWMSparkMax rightDrive  = new PWMSparkMax(1);
        PWMSparkMax shooterMotor = new PWMSparkMax(2);

        //  TODO 4a: Read the RIGHT stick's Y-axis from driver4 into a double
        //           named 'rightSpeed', then send that speed to rightDrive.
        //           (Two lines: one to read, one to set)


        //  TODO 4b: Read the RIGHT BUMPER button from driver4 into a boolean
        //           named 'fireButton'.
        //           Then write an if-statement: if fireButton is true,
        //           set shooterMotor to 0.8; otherwise set it to 0.0.
        //           (Three or four lines total)




        //  ── end challenge 4 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 5 — Fix the Bugs
        // ════════════════════════════════════════════════════════════════
        //
        //  Each comment below has a mistake. Leave the BUG line as a comment
        //  and write the corrected version on the blank line directly below it.

        //  BUG 5a:  XboxController driver = XboxController(0);
        //  FIX:


        //  BUG 5b:  PWMSparkMax leftMotor = new PWMSparkMax;
        //  FIX:


        //  BUG 5c:  TalonFX arm = new TalonFX(0.5);
        //           (Device IDs are whole numbers — 0.5 is not valid)
        //  FIX:


        //  BUG 5d:  leftDrive.set("fast");
        //           (set() expects a number between -1.0 and 1.0)
        //  FIX:


        //  BUG 5e:  double stickReading = driver.getAButton();
        //           (getAButton() does not return a number)
        //  FIX (change ONLY the variable type — keep everything else):


        //  ── end challenge 5 ─────────────────────────────────────────────


        // ════════════════════════════════════════════════════════════════
        //  CHALLENGE 6 — Full Drive & Shooter Setup  🔥 Boss Level
        // ════════════════════════════════════════════════════════════════
        //
        //  Build a complete drive + shooter setup from scratch.
        //
        //  TODO 6a: Declare these four objects:
        //             • XboxController named 'controller' on USB port 0
        //             • PWMSparkMax named 'leftWheel'  on PWM port 0
        //             • PWMSparkMax named 'rightWheel' on PWM port 1
        //             • TalonFX named 'flywheel' with CAN device ID 5




        //  TODO 6b: Wire the drivetrain.
        //             • Read LEFT stick Y → store in a double named 'leftPower'
        //             • Read RIGHT stick Y → store in a double named 'rightPower'
        //             • Send leftPower  to leftWheel
        //             • Send rightPower to rightWheel




        //  TODO 6c: Wire the shooter.
        //             • Read the A button → store in a boolean named 'shootPressed'
        //             • If shootPressed is true, set flywheel to 0.9
        //             • Otherwise, set flywheel to 0.0




        //  ── end challenge 6 ─────────────────────────────────────────────


    } // end main

} // end WPILibChallenge
