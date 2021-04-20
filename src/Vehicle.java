public class Vehicle {
    double speed;
    int power;
    void speedUp(int s){
        if(speed+s>=200){
            System.out.println("速度不能超过200");
        }
        else{
            speed=speed+s;
        }
        speed=s+speed;
    }
    void speedDown(int d){
        if(speed-d>0){
            System.out.println("速度不能小于0");
        }
        else{
            speed=speed-d;
        }
        speed=d+speed;
    }
    void setPower(int p){
        power=p;
    }
    void brake(int s){
        speed=0;
    }
    int getPower(){
        return power;
    }
    double getSpeed(){
        return speed;
    }
}