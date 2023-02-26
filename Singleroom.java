import java.io.Serializable;
import java.util.ArrayList;



class Singleroom implements Serializable
{
    String name; // declare varibles
    String contact;
    String gender;   
    ArrayList<Food> food =new ArrayList<>(); //array for food

   
    Singleroom() // constructor
    {
        this.name="";
    }
    Singleroom(String name,String contact,String gender)
    {
        this.name=name; // use this cuz we going to use yhis variables in diff calsss
        this.contact=contact;
        this.gender=gender;
    }
}