 class mammal {
    public void makeSound(){  
    System.out.println("the sound the mammal makes");
    }

}
class Dog extends mammal{
    public void makeSound(){
        System.out.println("bark bark");
    }
} 
class Hog extends mammal{
    public void makeSound(){
        System.out.println("pung pungk"); 
    }
} 
class Main {
  public static void main(String[] args) {
    mammal myMammal = new mammal();
    
    mammal myDog = new Dog();
    mammal myHog =new Hog();    
    myMammal.makeSound();
        myDog.makeSound();    
    myHog.makeSound();
    System.out.println( "myMammal" + "myMammal.makeSound()");
        System.out.println( "myDog" + "myDog.makeSound()");
    System.out.println( "myHog" + "myHog.makeSound()");

  }
} 
 