
class AngleBetweenHandsOnClock{
    public double angleClock(int hour, int minutes) { 
        double mins_angle = minutes * 6;
        double hours_angle = hour * 30 + minutes * 0.5;
        double angle = Math.abs(mins_angle - hours_angle);

        if(angle > 180){
            angle = 360 - angle;
        }
        else{
            angle = angle;
        }
        return angle;
    }
}