package com.example.vehicleservice;

public class FanData {

    public String ac_direction="Off";
    public String max_ac="Off";
    public String air_circulate="Off";
    public String bio_hazard="Off";
    public String rear_fan="Off";
    public int fan_speed;

    public String getAc_Direction() {
        return ac_direction;
    }

    public void setAc_Direction(String state) {
        ac_direction = state;
    }

    public String getMax_Ac() {
        return max_ac;
    }

    public void setMax_Ac(String state) {
        max_ac = state;
    }

    public String getAir_Circulate() {
        return air_circulate;
    }

    public void setAir_Circulate(String state) {
        air_circulate = state;
    }

    public String getBio_Hazard() {
        return bio_hazard;
    }

    public void setBio_Hazard(String state) {
        bio_hazard = state;
    }

    public String getRear_Fan() {
        return rear_fan;
    }

    public void setRear_Fan(String state) {
        rear_fan = state;
    }

    public int getFan_Speed() {
        return fan_speed;
    }

    public void setFan_Speed(int speed) {
        fan_speed = speed;
    }

}
