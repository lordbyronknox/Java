/*
Writing to a binary file.

FileOutputStream class      - connects to a File object and creates an output stream that can write to the file.
new FileOutputStream(<File object>)

BufferedOutputStream class  - connects to a FileOutputStream and adds output buffering.
new BufferedOutputStream(<FileOutputStream object>)

DataOutputStream class      - adds the ability to write primitive data types and strings to a stream.
new DataOutputStream(<BufferedOutputStream object>)
*/
package Page820.WritingToABinaryFile;

import java.io.*;

public class WriteBinaryFile {

    public static void main(String[] args) {
        Movie[] movies = getMovies();
        DataOutputStream out = openOutputStream("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Book_8\\src\\Page820\\WritingToABinaryFile\\movies.dat");
        for (Movie m : movies) {
            writeMovie(m, out);
        }
        closeFile(out);
    }

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

    private static DataOutputStream openOutputStream(String name) 
    {
        DataOutputStream out = null;
        try {
            File file = new File(name);                     //file: represents the file itself
            out = new DataOutputStream(                     //out:  the dataoutputstream (adds functionality)
                    new BufferedOutputStream(               //passed as arg to 'out'. (adds functionality)
                            new FileOutputStream(file)));   //passed as arg to BufferedOutputStream object, connects
                                                            // the file to the outputstream.
            /*  OR without nesting:
            File file = new File(name);
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream out = new DataOutputStream(bos);
*/            
            return out;
        } catch (IOException e) {                   //catches eceptions and exits the program.
            System.out.println(
                    "I/O Exception opening file.");
            System.exit(0);
        }
        return out;
    }

    //method that calls the different write methods to write to the file.
    //the buffer method accumulates data before writing. you can force it to write by calling 'out.flush()'
    private static void writeMovie(Movie m, DataOutputStream out) {  //(<movie to be written>, <output stream to write to the file>)
        try {
            out.writeUTF(m.title);
            out.writeInt(m.year);
            out.writeDouble(m.price);
        } catch (IOException e) {
            System.out.println(
                    "I/O Exception writing data.");
            System.exit(0);
        }
    }

    //when finished writing to a file close the file by calling out.close()
    private static void closeFile(DataOutputStream out) {
        try {
            out.close();
        } catch (IOException e) {
            System.out.println("I/O Exception closing file.");
            System.exit(0);
        }
    }

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
