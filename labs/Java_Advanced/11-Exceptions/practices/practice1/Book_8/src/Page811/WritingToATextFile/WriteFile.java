/*
Writing output to a file... using 3 classes:

FileWriter class -      connects to File object

BufferedWriter class -  connects to the FileWriter and provides output buffering.
                        (The buffer allows the program to accumulate data and then write it
                        when the buffer is full... as aposed to writing it one character at a time)

PrintWriter class -     Connects to the Writer, (eg. BufferedWriter, FileWriter etc).
 */
package Page811.WritingToATextFile;

import java.io.*;

public class WriteFile {

    public static void main(String[] args) 
    {
        Movie[] movies = getMovies();                   //calls getMovies() to get array of movies
        //calls printWriter() to create a PrintWriter object
        PrintWriter out = openWriter("C:\\Users\\byron\\Desktop\\Java\\Java\\Java For Dummies\\Book 5\\Book_5\\src\\Page811\\WritingToATextFile\\movies2.txt");
        for (Movie m : movies) {
            writeMovie(m, out);
        }
        out.close();
    }

//method that returns an array of movie objects
    private static Movie[] getMovies() {
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("It's a Wonderful Life", 1946, 14.95);
        movies[1] = new Movie("Young Frankenstein", 1974, 16.95);
        movies[2] = new Movie("Star Wars", 1977, 17.95);
        movies[3] = new Movie("The Princess Bride", 1987, 16.95);
        movies[4] = new Movie("Glory", 1989, 14.95);
        movies[5] = new Movie("The Game", 1997, 14.95);
        movies[6] = new Movie("Shakespeare in Love", 1998, 19.95);
        movies[7] = new Movie("Zombieland", 1997, 18.95);
        movies[8] = new Movie("The King's Speech", 1997, 19.95);
        movies[9] = new Movie("Star Trek Into Darkness", 1997, 19.95);
        return movies;
    }

    
//method     
    private static PrintWriter openWriter(String name) {
        try {
            File file = new File(name);                          //creates File object of 'movies@.txt'
            PrintWriter out = new PrintWriter(                   //PrintWriter: adds basic formatting capabilities
                                new BufferedWriter(              //BufferedWriter: adds buffering
                                  new FileWriter(file)), true);  //FileWriter: can write characters
                                                                 //true: tells BufferedWriter to flush its buffer whenever 
                                                                 // println is called to write a line of data
            return out;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return null;
    }

    
//method to create a movie string and print it    
    private static void writeMovie(Movie m, PrintWriter out) //(movie object, where movie should be written)
             {
        String line = m.title;
        line += "\t" + Integer.toString(m.year);
        line += "\t" + Double.toString(m.price);
        out.println(line);
    }

    
//inner class that defines a movie objects, with constructor.
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
