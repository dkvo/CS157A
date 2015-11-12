package config;

/**
 * Generated by Christopher Bachner on 11/11/2015
 */

/**
Adjust the values properly before compiling, so that your MySQL server can be accessed.
Usually you only need to change username and password.

 How to use it: Whenever you create a class that needs to access the database, implement this interface and use the constants in the JDBC.
**/
public interface MySQLConfig
{
  public final static String host = "localhost";
  public final static int port = 3306;
  public final static String user = "root";
  public final static String password = "root";
  public final static String database = "cs157a";
}