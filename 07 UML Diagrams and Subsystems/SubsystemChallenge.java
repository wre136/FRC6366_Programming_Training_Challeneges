// ════════════════════════════════════════════════════════════════════════
//  🏎️🔥  RamRodz Robotics — Team 6366
//  Programming Challenge: UML Class Diagrams & Building Subsystems
//
//  Name: _________________________________   Date: ____________________
//
//  Instructions:
//    - Read each challenge block carefully before writing any code.
//    - Write your answers in the space provided below each TODO comment.
//    - Do NOT delete or modify the TODO lines — write on the blank lines below them.
//    - Challenge 1 uses a pre-built IntakeSubsystem — study it carefully.
//    - Challenges 2–5 ask you to build a ShooterSubsystem from a UML diagram.
//    - Challenge 6 (Boss Level) asks you to design AND build from scratch.
//    - NOTE: Stub classes at the top simulate WPILib so this file compiles in
//      a standard Java IDE. In a real FRC project, use WPILib imports instead.
// ════════════════════════════════════════════════════════════════════════


// ════════════════════════════════════════════════════════════════════════
//  STUB CLASSES — Simulate WPILib for this exercise.
//  Do NOT edit these.
// ════════════════════════════════════════════════════════════════════════

class PWMSparkMax {
    int port;
    PWMSparkMax(int port) {
        this.port = port;
        System.out.println("  PWMSparkMax created on PWM port " + port);
    }
    void set(double speed) {
        System.out.println("  PWMSparkMax port " + port + " → speed: " + speed);
    }
}

class TalonFX {
    int deviceId;
    TalonFX(int deviceId) {
        this.deviceId = deviceId;
        System.out.println("  TalonFX created with CAN device ID " + deviceId);
    }
    void set(double speed) {
        System.out.println("  TalonFX ID " + deviceId + " → speed: " + speed);
    }
}

//  ── end stubs ───────────────────────────────────────────────────────────


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 1 — Read the IntakeSubsystem
// ════════════════════════════════════════════════════════════════════════
//
//  Study the finished IntakeSubsystem class below, then answer the
//  questions in the TODO comments inside main().
//
//  IntakeSubsystem UML:
//  ┌─────────────────────────────────────┐
//  │         IntakeSubsystem             │
//  ├─────────────────────────────────────┤
//  │  − motor       : PWMSparkMax        │
//  │  − rollerSpeed : double             │
//  │  − isRunning   : boolean            │
//  ├─────────────────────────────────────┤
//  │  + IntakeSubsystem()                │
//  │  + run()           : void           │
//  │  + stop()          : void           │
//  │  + getSpeed()      : double         │
//  │  + isActive()      : boolean        │
//  └─────────────────────────────────────┘

class IntakeSubsystem {

    private PWMSparkMax motor;
    private double      rollerSpeed;
    private boolean     isRunning;

    public IntakeSubsystem() {
        motor       = new PWMSparkMax(4);  // intake motor on PWM port 4
        rollerSpeed = 0.0;
        isRunning   = false;
    }

    public void run() {
        rollerSpeed = 0.65;   // 65% power
        isRunning   = true;
        motor.set(rollerSpeed);
    }

    public void stop() {
        rollerSpeed = 0.0;
        isRunning   = false;
        motor.set(0.0);
    }

    public double  getSpeed()  { return rollerSpeed; }
    public boolean isActive()  { return isRunning;   }
}


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 2 — Fill In the ShooterSubsystem Fields
// ════════════════════════════════════════════════════════════════════════
//
//  ShooterSubsystem UML:
//  ┌─────────────────────────────────────┐
//  │         ShooterSubsystem            │
//  ├─────────────────────────────────────┤
//  │  − flywheel     : TalonFX           │
//  │  − targetSpeed  : double            │
//  │  − isSpunUp     : boolean           │
//  ├─────────────────────────────────────┤
//  │  + ShooterSubsystem()               │
//  │  + spinUp()         : void          │
//  │  + spinDown()       : void          │
//  │  + shoot()          : void          │
//  │  + isReady()        : boolean       │
//  └─────────────────────────────────────┘
//
//  TODO 2: Declare the three private fields shown in the UML above.
//          (Three lines, one field per line — private keyword, type, name)

class ShooterSubsystem {

    // ↓ Write your three fields here (private keyword required)



    // ════════════════════════════════════════════════════════════════
    //  CHALLENGE 3 — Write the Constructor
    // ════════════════════════════════════════════════════════════════
    //
    //  The constructor must:
    //    • Create a TalonFX on CAN device ID 5 and store it in flywheel
    //    • Set targetSpeed to 0.0
    //    • Set isSpunUp to false
    //
    //  TODO 3: Write the constructor body below.

    public ShooterSubsystem() {
        // ↓ Your constructor code here (3 lines)



    }

    // ════════════════════════════════════════════════════════════════
    //  CHALLENGE 4 — Write spinUp() and spinDown()
    // ════════════════════════════════════════════════════════════════
    //
    //  spinUp() should:
    //    • Set targetSpeed to 0.85
    //    • Set isSpunUp to true
    //    • Call flywheel.set(targetSpeed)
    //
    //  spinDown() should:
    //    • Set targetSpeed to 0.0
    //    • Set isSpunUp to false
    //    • Call flywheel.set(0.0)
    //
    //  TODO 4a: Write the spinUp() method below.

    public void spinUp() {
        // ↓ Your code here (3 lines)



    }

    //  TODO 4b: Write the spinDown() method below.

    public void spinDown() {
        // ↓ Your code here (3 lines)



    }

    // ════════════════════════════════════════════════════════════════
    //  CHALLENGE 5 — Write shoot() and isReady()
    // ════════════════════════════════════════════════════════════════
    //
    //  shoot() should:
    //    • Only fire if isSpunUp is true
    //    • If spinning: print "🔥 Firing!" to the console  [System.out.println]
    //    • If NOT spinning: print "⚠️ Flywheel not ready." to the console
    //
    //  isReady() should:
    //    • Return the value of isSpunUp  (one line)
    //
    //  TODO 5a: Write the shoot() method below.

    public void shoot() {
        // ↓ Your code here



    }

    //  TODO 5b: Write the isReady() method below.

    public boolean isReady() {
        return false; // ← TODO: replace with the correct return statement
    }
}


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 6 — Boss Level 🔥 Design and Build ClimberSubsystem
// ════════════════════════════════════════════════════════════════════════
//
//  Here is the UML diagram for the ClimberSubsystem.
//  Your job is to write the full Java class below it.
//
//  ┌─────────────────────────────────────────────────┐
//  │              ClimberSubsystem                   │
//  ├─────────────────────────────────────────────────┤
//  │  − armMotor    : PWMSparkMax                    │
//  │  − armPosition : double                         │
//  │  − deployed    : boolean                        │
//  ├─────────────────────────────────────────────────┤
//  │  + ClimberSubsystem()                           │
//  │  + deploy(position : double)  : void            │
//  │  + retract()                  : void            │
//  │  + isDeployed()               : boolean         │
//  └─────────────────────────────────────────────────┘
//
//  Rules:
//    • armMotor   → PWMSparkMax on PWM port 6
//    • armPosition starts at 0.0,  deployed starts at false
//    • deploy(double position):
//        - Store the incoming position value in armPosition
//        - Set deployed to true
//        - Call armMotor.set(armPosition)
//    • retract():
//        - Set armPosition to 0.0
//        - Set deployed to false
//        - Call armMotor.set(0.0)
//    • isDeployed(): return deployed  (one line)
//
//  TODO 6: Write the complete ClimberSubsystem class below.
//          (Fields, constructor, deploy, retract, isDeployed)
//
//  STARTER SHELL — replace the method bodies with your own code:

// ↓ Write your class here (the shell below compiles but does nothing — fill it in!)
class ClimberSubsystem {

    // TODO: add your three private fields here



    public ClimberSubsystem() {
        // TODO: create armMotor (PWMSparkMax port 6), set armPosition = 0.0, deployed = false

    }

    public void deploy(double position) {
        // TODO: store position, set deployed = true, call armMotor.set(armPosition)

    }

    public void retract() {
        // TODO: set armPosition = 0.0, deployed = false, call armMotor.set(0.0)

    }

    public boolean isDeployed() {
        return false; // ← TODO: replace with the correct return statement
    }
}




// ════════════════════════════════════════════════════════════════════════
//  MAIN — Runs all challenges and prints results
//  Do NOT edit this class. It creates your subsystems and calls their methods.
// ════════════════════════════════════════════════════════════════════════

public class SubsystemChallenge {

    public static void main(String[] args) {

        // ── Challenge 1 demo ─────────────────────────────────────────────
        System.out.println("\n=== Challenge 1 — IntakeSubsystem ===");
        IntakeSubsystem intake = new IntakeSubsystem();
        System.out.println("Active before run(): " + intake.isActive());  // false
        intake.run();
        System.out.println("Speed after run(): "   + intake.getSpeed());   // 0.65
        System.out.println("Active after run(): "  + intake.isActive());   // true
        intake.stop();
        System.out.println("Active after stop(): " + intake.isActive());   // false


        // ── Challenge 2–5 test ───────────────────────────────────────────
        System.out.println("\n=== Challenges 2–5 — ShooterSubsystem ===");
        ShooterSubsystem shooter = new ShooterSubsystem();
        System.out.println("Ready before spinUp: " + shooter.isReady());   // false
        shooter.shoot();   // should print ⚠️ message
        shooter.spinUp();
        System.out.println("Ready after spinUp: "  + shooter.isReady());   // true
        shooter.shoot();   // should print 🔥 message
        shooter.spinDown();
        System.out.println("Ready after spinDown: " + shooter.isReady());  // false


        // ── Challenge 6 test ─────────────────────────────────────────────
        System.out.println("\n=== Challenge 6 — ClimberSubsystem ===");
        ClimberSubsystem climber = new ClimberSubsystem();
        System.out.println("Deployed before deploy: " + climber.isDeployed()); // false
        climber.deploy(0.75);
        System.out.println("Deployed after deploy:  " + climber.isDeployed()); // true
        climber.retract();
        System.out.println("Deployed after retract: " + climber.isDeployed()); // false

        System.out.println("\n🏎️🔥 All tests complete!");
    }
}
