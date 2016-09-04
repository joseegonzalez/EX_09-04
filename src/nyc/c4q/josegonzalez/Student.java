package nyc.c4q.josegonzalez;

/**
 * Created by mathcore on 9/4/16.
 */
public class Student {
    private String firstName;
    private String  lastName;
    private int idNumber;
    private String favoriteFood;

    public Student(){

    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String nombre){
        this.firstName = nombre;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String apellido){
        this.lastName = apellido;
    }
    public int getIDNumber(){
        return this.idNumber;
    }
    public void setIDNumber(int number){
        this.idNumber = number;
    }
    public String getFavoriteFood(){
        return this.favoriteFood;
    }
    public void setFavoriteFood(String food){
        this.favoriteFood = food;
    }

}
