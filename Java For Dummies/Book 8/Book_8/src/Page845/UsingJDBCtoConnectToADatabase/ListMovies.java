/*
JDBC - Java Database Connectivity
A feature that lets you connect to a relational database, execute SQL commands, and process the results
from within a java program.

FIRST: Set up the driver. (install a driver that links Java's database API classes to a database.)
    JDBC driver for MySQL:  www.mysql.com/products/connector    (Connector/j)

1. Establish a connection to the database:
    Register the driver class so the class is available, using .forName() of Class class. (in try/catch)
    eg. Class.forName("com.mysql.jdbc.Driver");         //register MySQL connector
        Class.forNAme("sun.jdbc.odbc.JdbcOdbcDriver"); //register standard ODBC driver
2. Call the static DriverManager.getConnection() to open the connection.
    This method takes 3 String parameters:  * the database URL   
                                              (jdbc:subprotocol:subname):
                                                subprotocol = mysql / odbc
                                                subname = on your pc: //localhost. Or complete URL.
                                            * username
                                            * password
    String url = "jdbc:mysql://localhost/Movies";       
    String user = "root";
    String pw = "pw";
    con = DriverManager.getConnection(url, user, pw);

QUERYING A DATABASE

 */
package Page845.UsingJDBCtoConnectToADatabase;

import java.sql.*;
import java.text.NumberFormat;

public class ListMovies {

    public static void main(String[] args) 
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        ResultSet movies = getMovies();                 //returns resultset object containing list of movies
        try {
            while (movies.next()) {                     //loop through each row of the resultset
                Movie m = getMovie(movies);             //
                String msg = Integer.toString(m.year);  //String created to send to console.
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";
                System.out.println(msg);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//method that gets the connection to the database, and sends a select statement to retrieve data.
    private static ResultSet getMovies() {
        Connection con = getConnection();           //getConnection() called to connect to database.
        try {
            Statement s = con.createStatement();
            String select = "Select title, year, price from movie order by year";
            ResultSet rows;
            rows = s.executeQuery(select);
            return rows;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

//method that creates a connection object to the database.
    private static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Movies";
            String user = "root";      
            String pw = "Ambulance7";
            con = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return con;
    }

//method that creates a movie object from the data in current row.
    private static Movie getMovie(ResultSet movies) {
        try {
            String title = movies.getString("Title");
            int year = movies.getInt("Year");
            double price = movies.getDouble("Price");
            return new Movie(title, year, price);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
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


/*
To update:  use .executeUpdate() in stead of .executeQuery(). and use the appropriate update statement string).


*/