class vechical{
    vechical(){
        System.out.println("this is a vechical");
    }
}
class car extends vechical{
    car(){
        System.out.println("this is a car");
    }
}
class Bus extends vechical{
    Bus (){
        System.out.println("this is Bus");
    }
}
public class hierarchical{
    public static void main (String[] args) {
        car obj1 = new car();
        Bus obj2 = new Bus();
        
    }
}