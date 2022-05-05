package immersive_airships.entity.properties;

import immersive_airships.entity.AirshipEntity;

public class AircraftProperties {
    private final AirshipEntity airship;

    private float yawSpeed, pitchSpeed, pushSpeed, engineSpeed, glideFactor, maxPitch, driftDrag, lift, verticalSpeed, windSensitivity, wheelFriction, rollFactor, groundPitch, stabilizer;

    public AircraftProperties(AirshipEntity airship) {
        this.airship = airship;
    }

    public float getYawSpeed() {
        return yawSpeed;
    }

    public AircraftProperties setYawSpeed(float yawSpeed) {
        this.yawSpeed = yawSpeed;
        return this;
    }

    public float getPitchSpeed() {
        return pitchSpeed;
    }

    public AircraftProperties setPitchSpeed(float pitchSpeed) {
        this.pitchSpeed = pitchSpeed;
        return this;
    }

    public float getPushSpeed() {
        return pushSpeed;
    }

    public AircraftProperties setPushSpeed(float pushSpeed) {
        this.pushSpeed = pushSpeed;
        return this;
    }

    public float getEngineSpeed() {
        return engineSpeed;
    }

    public AircraftProperties setEngineSpeed(float engineSpeed) {
        this.engineSpeed = engineSpeed;
        return this;
    }

    public float getGlideFactor() {
        return glideFactor;
    }

    public AircraftProperties setGlideFactor(float glideFactor) {
        this.glideFactor = glideFactor;
        return this;
    }

    public float getMaxPitch() {
        return maxPitch;
    }

    public AircraftProperties setMaxPitch(float maxPitch) {
        this.maxPitch = maxPitch;
        return this;
    }

    public float getDriftDrag() {
        return driftDrag;
    }

    public AircraftProperties setDriftDrag(float driftDrag) {
        this.driftDrag = driftDrag;
        return this;
    }

    public float getLift() {
        return lift;
    }

    public AircraftProperties setLift(float lift) {
        this.lift = lift;
        return this;
    }

    public float getVerticalSpeed() {
        return verticalSpeed;
    }

    public AircraftProperties setVerticalSpeed(float verticalSpeed) {
        this.verticalSpeed = verticalSpeed;
        return this;
    }

    public float getWindSensitivity() {
        return windSensitivity;
    }

    public AircraftProperties setWindSensitivity(float windSensitivity) {
        this.windSensitivity = windSensitivity;
        return this;
    }

    public float getWheelFriction() {
        return wheelFriction;
    }

    public AircraftProperties setWheelFriction(float wheelFriction) {
        this.wheelFriction = wheelFriction;
        return this;
    }

    public float getRollFactor() {
        return rollFactor;
    }

    public AircraftProperties setRollFactor(float rollFactor) {
        this.rollFactor = rollFactor;
        return this;
    }

    public float getGroundPitch() {
        return groundPitch;
    }

    public AircraftProperties setGroundPitch(float groundPitch) {
        this.groundPitch = groundPitch;
        return this;
    }

    public float getStabilizer() {
        return stabilizer;
    }

    public AircraftProperties setStabilizer(float stabilizer) {
        this.stabilizer = stabilizer;
        return this;
    }
}
