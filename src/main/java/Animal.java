public class Animal {
    public static void main(String[] args) {
        System.out.println("Running my teacher examples");
        Animal myAnimal = new Cat();
        Cat martin = (Cat)myAnimal;
        System.out.println(martin.getClass().toString());
        martin.startMeow();
    }    
    

    public void startMeow() {
        System.out.println("I'm a cat");
    }

}


