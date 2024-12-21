interface Vehicle{
    void start();
}
interface Engine{
    void accelerate();
}
interface Steering{
    void steer();
}
interface car extends Vehicle,Engine,Steering{

}
class Car implements car{
    public void start(){
        System.out.println("Start");
    }
    public void accelerate(){
        System.out.println("engine");
    }
    public void Steer(){
        System.out.println("Steering");
    }
    public static void main(String[]args){
        Car c=new Car();
        c.start();
        c.accelerate();
        c.steer();    }
}
