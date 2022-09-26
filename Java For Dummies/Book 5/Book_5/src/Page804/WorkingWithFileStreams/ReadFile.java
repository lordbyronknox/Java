/*

 */
package Page804.WorkingWithFileStreams;

import java.io.*;

import java.text.NumberFormat;

public class ReadFile {

    public static void main(String[] args) 
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        BufferedReader in = getReader("movies.txt");
        Movie movie = readMovie(in);
        while (movie != null) {
            String msg = Integer.toString(movie.year);
            msg += ": " + movie.title;
            msg += " (" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);
        }
    }

    
//method that creates and returns a BufferedReader object ('in') that can read the file.
    private static BufferedReader getReader(String name) {
        BufferedReader in = null;
        try {
            File file = new File(name);
            in = new BufferedReader(new FileReader(file));
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }


//method that reads each line from the reader and returns a Movie object with
// title, year and price properties.
    private static Movie readMovie(BufferedReader in) {
        String title;
        int year;
        double price;
        String line = "";
        String[] data;
        try {
            line = in.readLine();
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        if (line == null) {
            return null;
        } else {
            data = line.split("\t");
            title = data[0];
            year = Integer.parseInt(data[1]);
            price = Double.parseDouble(data[2]);
            return new Movie(title, year, price);
        }
    }

    
//inner Movie class to create Movie objects    
    private static class Movie {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
