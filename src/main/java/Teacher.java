public class Teacher {
    public static void main(String[] args) {
        System.out.println("Running my teacher examples");
        Teacher baseTeacher = new Teacher();
        baseTeacher.startTeach();
        Coach martin = new Coach();
        martin.startTeach();
        
    }    
    

    private void startTeach() {
        System.out.println("I'm teaching a class");
    }
}


