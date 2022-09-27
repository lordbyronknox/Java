/*
Binary streams, used to store data in raw binary format rather than in text.
file.dat
To read a binary file you usually use:
File class                - to create a file object that represents the file.
FileInputStream class     - which links the File to the input stream.
BufferedInputStream class - adds buffer to the basic FileInput Stream.
DataInputStream class     - class used to read data from stream.
 */
package Page813.ReadingBinaryStreams;


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;

public class ReadBinaryFile 
{

        public static void main(String[] args)
         {
            NumberFormat cf = NumberFormat.getCurrencyInstance();   //NumberFormat object created to format currency
            
            //getStream() called to get a data input stream object to read the file.
            DataInputStream in = getStream("C:\\Users\\byron\\Desktop\\Java\\Java\\labs\\Java_Advanced\\11-Exceptions\\practices\\practice1\\Book_8\\src\\Page820\\WritingToABinaryFile\\movies.dat");
            
            //while loop calls readMovie() with DataStream object 'in' passed at arg to get movie object. 
            // and print to console.
            boolean eof = false;
            while (!eof) {
                Movie movie = readMovie(in);
                if (movie == null) {
                    eof = true;
                } else {
                    String msg = Integer.toString(movie.year);
                    msg += ": " + movie.title;
                    msg += " (" + cf.format(movie.price) + ")";
                    System.out.println(msg);
                }
            }
            closeFile(in);
        }

//method that 
        private static DataInputStream getStream(String name) {
            DataInputStream in = null;
            try {
                File file = new File(name);
                in = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(file)));
            } catch (FileNotFoundException e) {
                System.out.println("The file doesn't exist.");
                System.exit(0);
            }
            return in;
        }

        //method that 
        private static Movie readMovie(DataInputStream in) {
            String title = "";
            int year = 0;;
            double price = 0.0;;
            try {
                title = in.readUTF();
                year = in.readInt();
                price = in.readDouble();
            } catch (EOFException e) {
                return null;
            } catch (IOException e) {
                System.out.println("I/O Error");
                System.exit(0);
            }
            return new Movie(title, year, price);
        }

        private static void closeFile(DataInputStream in) {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println("I/O Error closing file.");
                System.out.println();
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
