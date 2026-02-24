 class Animal {
    protected String breed="dog";
    public void eat(){
        System.out.println("bones");
    }
} 
class mammal extends Animal { 
    private String breedName =("Germansheperd");
    public static void main(String[] args) {
        mammal myMammal=new mammal();
        myMammal.eat();
        System.out.println(myMammal.breed+ "  "  +myMammal.breedName);
    }
 
 }
     
