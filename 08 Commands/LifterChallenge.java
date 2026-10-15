// ════════════════════════════════════════════════════════════════════════
//  🏎️🔥  RamRodz Robotics — Team 6366
//  Programming Challenge: Command-Based Robots & Subsystem Commands
//
//  Name: _________________________________   Date: ____________________
//
//  Instructions:
//    - Read each challenge block carefully before writing any code.
//    - Write your answers in the space below each TODO comment.
//    - Do NOT delete or modify the TODO lines.
//    - Challenge 1 shows a finished GrabberSubsystem — study it closely.
//    - Challenges 2–5 walk you through building LifterSubsystem from its UML.
//    - Challenge 6 (Boss Level) is a full Command-Based subsystem from scratch.
//    - NOTE: Stub classes at the top simulate WPILib and Command infrastructure
//      so this file compiles in a standard Java IDE without a robot project.
// ════════════════════════════════════════════════════════════════════════


// ════════════════════════════════════════════════════════════════════════
//  STUB CLASSES — Simulate WPILib Command infrastructure.
//  Do NOT edit these.
// ════════════════════════════════════════════════════════════════════════

/** Simulates a WPILib Command — wraps a Runnable action. */
class Command {
    private String label;
    private Runnable action;

    Command(String label, Runnable action) {
        this.label  = label;
        this.action = action;
    }

    /** Simulate the Scheduler running this command. */
    void schedule() {
        System.out.println("  [Scheduler] Running command: " + label);
        action.run();
    }

    /** Chain: run this command, then the next one. */
    Command andThen(Command next) {
        return new Command(this.label + " → " + next.label, () -> {
            this.schedule();
            next.schedule();
        });
    }
}

/** Simulates Commands.sequence() — runs each command in order. */
class Commands {
    static Command sequence(Command... steps) {
        return new Command("sequence", () -> {
            for (Command c : steps) {
                c.schedule();
            }
        });
    }

    static Command waitSeconds(double seconds) {
        return new Command("wait(" + seconds + "s)", () ->
            System.out.println("  [Scheduler] Waiting " + seconds + " s...")
        );
    }
}

/** Simulates SubsystemBase — provides runOnce() and run(). */
class SubsystemBase {
    /** One-shot command: fires the lambda once, then finishes. */
    protected Command runOnce(Runnable action) {
        return new Command(this.getClass().getSimpleName() + ".runOnce", action);
    }

    /** Continuous command: keeps firing the lambda (simulated as one shot here). */
    protected Command run(Runnable action) {
        return new Command(this.getClass().getSimpleName() + ".run [continuous]", action);
    }
}

/** Simulates a PWMSparkMax motor controller. */
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

/** Simulates a TalonFX motor controller. */
class TalonFX {
    int deviceId;
    TalonFX(int deviceId) {
        this.deviceId = deviceId;
        System.out.println("  TalonFX CAN ID " + deviceId + " created");
    }
    void set(double speed) {
        System.out.println("  TalonFX ID " + deviceId + " → speed: " + speed);
    }
}

//  ── end stubs ───────────────────────────────────────────────────────────


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 1 — Read the GrabberSubsystem
// ════════════════════════════════════════════════════════════════════════
//
//  Study the finished GrabberSubsystem below, then answer the questions
//  in main() under the Challenge 1 comment block.
//
//  UML:
//  ┌─────────────────────────────────────┐
//  │       GrabberSubsystem              │
//  │       extends SubsystemBase         │
//  ├─────────────────────────────────────┤
//  │  − motor      : PWMSparkMax         │
//  │  − isGripping : boolean             │
//  ├─────────────────────────────────────┤
//  │  + GrabberSubsystem()               │
//  │  + grip()     : Command             │
//  │  + release()  : Command             │
//  │  + isHolding(): boolean             │
//  └─────────────────────────────────────┘

class GrabberSubsystem extends SubsystemBase {

    private final PWMSparkMax motor;
    private boolean           isGripping;

    public GrabberSubsystem() {
        motor      = new PWMSparkMax(3);   // gripper motor on PWM port 3
        isGripping = false;
    }

    public Command grip() {
        return runOnce(() -> {
            motor.set(0.6);        // spin inward to grip
            isGripping = true;
        });
    }

    public Command release() {
        return runOnce(() -> {
            motor.set(-0.3);       // spin outward to drop
            isGripping = false;
        });
    }

    public boolean isHolding() { return isGripping; }
}


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 2 — Declare LifterSubsystem Fields
// ════════════════════════════════════════════════════════════════════════
//
//  LifterSubsystem UML:
//  ┌─────────────────────────────────────┐
//  │        LifterSubsystem              │
//  │        extends SubsystemBase        │
//  ├─────────────────────────────────────┤
//  │  − grabMotor  : PWMSparkMax         │
//  │  − liftMotor  : PWMSparkMax         │
//  │  − isGripping : boolean             │
//  │  − isLifted   : boolean             │
//  ├─────────────────────────────────────┤
//  │  + LifterSubsystem()                │
//  │  + grab()      : Command            │
//  │  + release()   : Command            │
//  │  + lift()      : Command            │
//  │  + lower()     : Command            │
//  │  + scoreBall() : Command            │
//  │  + isGripping(): boolean            │
//  │  + isLifted()  : boolean            │
//  └─────────────────────────────────────┘
//
//  TODO 2: Declare the four private fields from the UML.
//          (Four lines — use 'private final' for the two motors)

class LifterSubsystem extends SubsystemBase {

    // ↓ Your four fields here



    // ════════════════════════════════════════════════════════════════
    //  CHALLENGE 3 — Write the Constructor
    // ════════════════════════════════════════════════════════════════
    //
    //  Constructor rules (from the UML):
    //    • grabMotor → new PWMSparkMax on port 0
    //    • liftMotor → new PWMSparkMax on port 1
    //    • isGripping = false
    //    • isLifted   = false
    //
    //  TODO 3: Write the constructor body below.

    public LifterSubsystem() {
        // ↓ Your 4 lines here



    }

    // ════════════════════════════════════════════════════════════════
    //  CHALLENGE 4 — Write grab(), release(), lift(), lower()
    // ════════════════════════════════════════════════════════════════
    //
    //  Each method must:
    //    • Return a Command (NOT void)
    //    • Use runOnce(() -> { … })
    //    • Set the motor speed AND update the boolean state field
    //
    //  Speed guide:
    //    grab()    → grabMotor.set(0.7),  isGripping = true
    //    release() → grabMotor.set(-0.4), isGripping = false
    //    lift()    → liftMotor.set(0.8),  isLifted   = true
    //    lower()   → liftMotor.set(-0.6), isLifted   = false
    //
    //  TODO 4a: Write grab() below.

    public Command grab() {
        // ↓ return runOnce(() -> { … })

        return null; // ← replace this line with your real return statement
    }

    //  TODO 4b: Write release() below.

    public Command release() {
        // ↓ return runOnce(() -> { … })

        return null; // ← replace this line
    }

    //  TODO 4c: Write lift() below.

    public Command lift() {
        // ↓ return runOnce(() -> { … })

        return null; // ← replace this line
    }

    //  TODO 4d: Write lower() below.

    public Command lower() {
        // ↓ return runOnce(() -> { … })

        return null; // ← replace this line
    }

    // ════════════════════════════════════════════════════════════════
    //  CHALLENGE 5 — Write scoreBall() Sequence + State Getters
    // ════════════════════════════════════════════════════════════════
    //
    //  scoreBall() must return a Commands.sequence() that runs:
    //    1. grab()
    //    2. Commands.waitSeconds(0.5)
    //    3. lift()
    //    4. Commands.waitSeconds(1.0)
    //    5. release()
    //
    //  isGripping() and isLifted() each return their matching field (one line each).
    //
    //  TODO 5a: Write scoreBall() below.

    public Command scoreBall() {
        // ↓ return Commands.sequence( … )

        return null; // ← replace this line
    }

    //  TODO 5b: Write isGripping() — one line, returns the boolean field.

    public boolean isGripping() {
        return false; // ← TODO: replace with correct return
    }

    //  TODO 5c: Write isLifted() — one line, returns the boolean field.

    public boolean isLifted() {
        return false; // ← TODO: replace with correct return
    }
}


// ════════════════════════════════════════════════════════════════════════
//  CHALLENGE 6 — Boss Level 🔥 Build SpinnerSubsystem from UML
// ════════════════════════════════════════════════════════════════════════
//
//  Here is the UML for a new subsystem. Build the entire class below it.
//
//  ┌──────────────────────────────────────────────────────┐
//  │              SpinnerSubsystem                        │
//  │              extends SubsystemBase                   │
//  ├──────────────────────────────────────────────────────┤
//  │  − spinMotor  : TalonFX                              │
//  │  − isSpinning : boolean                              │
//  │  − speed      : double                               │
//  ├──────────────────────────────────────────────────────┤
//  │  + SpinnerSubsystem()                                │
//  │  + spinForward()  : Command   // full speed forward  │
//  │  + spinReverse()  : Command   // half speed reverse  │
//  │  + stop()         : Command   // stop motor          │
//  │  + isSpinning()   : boolean                          │
//  └──────────────────────────────────────────────────────┘
//
//  Rules:
//    • spinMotor → TalonFX on CAN device ID 8
//    • isSpinning and speed both start at 0.0 / false in constructor
//    • spinForward() → spinMotor.set(1.0),  isSpinning = true,  speed = 1.0
//    • spinReverse() → spinMotor.set(-0.5), isSpinning = true,  speed = -0.5
//    • stop()        → spinMotor.set(0.0),  isSpinning = false, speed = 0.0
//    • isSpinning()  → return isSpinning
//
//  TODO 6: Write the complete SpinnerSubsystem class below.
//          (Fields, constructor, spinForward, spinReverse, stop, isSpinning)

// ↓ Write your class here (starter shell is provided — fill in every method)
class SpinnerSubsystem extends SubsystemBase {

    // TODO: declare your three fields



    public SpinnerSubsystem() {
        // TODO: create spinMotor (TalonFX CAN 8), set isSpinning = false, speed = 0.0

    }

    public Command spinForward() {
        // TODO: return runOnce with set(1.0), isSpinning = true, speed = 1.0
        return null; // ← replace
    }

    public Command spinReverse() {
        // TODO: return runOnce with set(-0.5), isSpinning = true, speed = -0.5
        return null; // ← replace
    }

    public Command stop() {
        // TODO: return runOnce with set(0.0), isSpinning = false, speed = 0.0
        return null; // ← replace
    }

    public boolean isSpinning() {
        return false; // ← TODO: return the real field
    }
}


// ════════════════════════════════════════════════════════════════════════
//  MAIN — Tests all challenges
//  Do NOT edit. It creates your subsystems and schedules their commands.
// ════════════════════════════════════════════════════════════════════════

public class LifterChallenge {

    public static void main(String[] args) {

        // ── Challenge 1 demo ─────────────────────────────────────────────
        System.out.println("\n=== Challenge 1 — GrabberSubsystem ===");
        GrabberSubsystem grabber = new GrabberSubsystem();
        System.out.println("Holding before grip: " + grabber.isHolding());    // false
        grabber.grip().schedule();
        System.out.println("Holding after grip:  " + grabber.isHolding());    // true
        grabber.release().schedule();
        System.out.println("Holding after release: " + grabber.isHolding());  // false


        // ── Challenges 2–5 test ──────────────────────────────────────────
        System.out.println("\n=== Challenges 2–5 — LifterSubsystem ===");
        LifterSubsystem lifter = new LifterSubsystem();

        System.out.println("Gripping before grab: " + lifter.isGripping());   // false
        if (lifter.grab() != null)    lifter.grab().schedule();
        System.out.println("Gripping after grab:  " + lifter.isGripping());   // true

        System.out.println("Lifted before lift:   " + lifter.isLifted());     // false
        if (lifter.lift() != null)    lifter.lift().schedule();
        System.out.println("Lifted after lift:    " + lifter.isLifted());     // true

        System.out.println("\n--- Running scoreBall() sequence ---");
        if (lifter.scoreBall() != null) lifter.scoreBall().schedule();

        System.out.println("\nGripping after scoreBall: " + lifter.isGripping()); // false
        System.out.println("Lifted after scoreBall:   " + lifter.isLifted());    // true


        // ── Challenge 6 test ─────────────────────────────────────────────
        System.out.println("\n=== Challenge 6 — SpinnerSubsystem ===");
        SpinnerSubsystem spinner = new SpinnerSubsystem();

        System.out.println("Spinning before spinForward: " + spinner.isSpinning()); // false
        if (spinner.spinForward() != null) spinner.spinForward().schedule();
        System.out.println("Spinning after spinForward:  " + spinner.isSpinning()); // true
        if (spinner.spinReverse() != null) spinner.spinReverse().schedule();
        if (spinner.stop() != null)        spinner.stop().schedule();
        System.out.println("Spinning after stop:         " + spinner.isSpinning()); // false

        System.out.println("\n🏎️🔥 All tests complete!");
    }
}
