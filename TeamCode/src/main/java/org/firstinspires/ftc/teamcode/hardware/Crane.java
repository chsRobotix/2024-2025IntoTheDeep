package org.firstinspires.ftc.teamcode.hardware;

import java.util.HashSet;

public class Crane extends Arm {
    private final DcMotor LAZY_SUSAN_MOTOR;

    public Crane(DcMotor lazySusanMotor) {
        this.LAZY_SUSAN_MOTOR = lazySusanMotor;
    }

    @Override
    public HashSet<DcMotor> getAllMotors() {
        HashSet<DcMotor> motors = new HashSet<>();
<<<<<<< HEAD

        motors.add(LAZY_SUSAN_MOTOR);
=======
>>>>>>> 156e31cfa11368924efe417e035ddfdb8b7f0fbc

        return motors;
    }
}