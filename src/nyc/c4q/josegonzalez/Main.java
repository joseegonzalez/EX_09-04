package nyc.c4q.josegonzalez;

public class Main {

    public static void main(String[] args) {
    Student newStudent = new Student();
	// write your code here
    }
    public static boolean checkSameFavoriteFood(Student a, Student b){
        return a.getFavoriteFood().equalsIgnoreCase(b.getFavoriteFood());


    }
}
