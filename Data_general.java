import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Data_general {

    private ArrayList<String> Movies;
    private ArrayList<String> Series;



    public ArrayList<String> Import_movies() throws Exception {
        
        File file = new File("./film.txt");
        Scanner s = new Scanner(file);
        this.Movies = new ArrayList<>();
        while(s.hasNextLine()){
            Movies.add(s.nextLine());
       
    }
        s.close();
        return Movies;


}

    public ArrayList<String> Import_series() throws Exception {
        
        File file = new File("./serier.txt");
        Scanner s = new Scanner(file);
        this.Series = new ArrayList<>();
        while(s.hasNextLine()){
            Series.add(s.nextLine());
       
    }
        s.close();
        return Series;


}




}
