import java.util.*;

public class test {

    public static void main(String[] args) {


        

        Data_general data = new Data_general();
        try {
        ArrayList<String> test = data.Import_movies();
        
        for(String s : test) System.out.println(s);



        } catch(Exception e) {System.out.println(e.getMessage());}

        try {
        ArrayList<String> test = data.Import_series();
        
        for(String s : test) System.out.println(s);



        } catch(Exception e) {System.out.println(e.getMessage());}



    }



    
}
