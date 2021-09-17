package jia;

public class Nvwawa
{
    public static create getcreate(String people){
        create Naoren=null;
        if(people.equalsIgnoreCase("M")){
            Naoren=new Man();
        }else if(people.equalsIgnoreCase("W")){
            Naoren=new Woman();
        }else if(people.equalsIgnoreCase("R")){
            Naoren=new Robot();
        }
        return  Naoren;
    }
}
