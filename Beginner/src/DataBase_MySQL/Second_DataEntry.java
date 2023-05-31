package DataBase_MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Second_DataEntry {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/giraffe";
        String user = "root";
        String password = "your-password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO student (Student_ID, name, major, GPA, Hobby) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, 8);
            stmt.setString(2, "Vaibhav");
            stmt.setString(3, "Mechanical");
            stmt.setFloat(4,8.36f);
            stmt.setString(5, "Cricket");
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Source - Chat with Bing
1)What does this particular statement achieve - import.java.sql.DriverManager; ?
Ans) The statement import java.sql.DriverManager; imports the DriverManager class from the java.sql
package. The DriverManager class is responsible for managing a list of JDBC drivers and provides
methods for establishing a connection to a database using one of the registered drivers.
By importing the DriverManager class, you can use it in your code without having to fully qualify
its name every time you use it. For example, instead of writing
java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, password);,
you can write Connection conn = DriverManager.getConnection(url, user, password);.

2)What are the list of JDBC drivers ?
Ans) JDBC drivers are client-side adapters that convert requests from Java programs to a protocol
that the database management system (DBMS) can understand. There are four types of JDBC drivers:
Type 1 (JDBC-ODBC Bridge driver), Type 2 (Native-API driver), Type 3 (Network Protocol driver),
and Type 4 (Thin driver) .
Each type of JDBC driver is designed to work with a specific DBMS. Some popular JDBC drivers
include MySQL Connector/J for MySQL, Oracle JDBC driver for Oracle, Microsoft JDBC Driver for SQL
Server, and PostgreSQL JDBC Driver for PostgreSQL.

3)What does this particular statement achieve -
Connection conn = DriverManager.getConnection(url, user, password) ?
Ans) The statement Connection conn = DriverManager.getConnection(url, user, password) uses the
getConnection method of the DriverManager class to establish a connection to a database. The url
parameter specifies the location of the database, and the user and password parameters specify the
credentials to use when connecting to the database.
The getConnection method returns a Connection object that represents the connection to the database.
You can use this object to create Statement and PreparedStatement objects for executing SQL
statements and managing transactions.

Yes, in the statement Connection conn = DriverManager.getConnection(url, user, password),
Connection is a class and conn is an object of the Connection class.
The Connection class represents a connection to a database and provides methods for interacting
with the database. The getConnection method of the DriverManager class returns a new Connection
object that represents a connection to the database specified by the url, user, and password parameters.


4)Difference between method and a object.
Ans) In Java, an object is an instance of a class that encapsulates data and behavior. Objects
have state (represented by instance variables) and behavior (represented by methods).
A method is a block of code that performs a specific task and can be invoked (called) by other code.
Methods can be associated with a class (static methods) or with an instance of a
class (instance methods). Instance methods operate on the state of the object they are called on
and can access the object’s instance variables.
In summary, an object is an instance of a class that has state and behavior, while a method is a
block of code that performs a specific task and can be associated with either a class or an instance
of a class.

5) In the statement - PreparedStatement stmt = conn.prepareStatement(query); , is PreparedStatement
a class or an object ?
Ans) In the statement PreparedStatement stmt = conn.prepareStatement(query);, PreparedStatement is
a class and stmt is an object of the PreparedStatement class.
The PreparedStatement class represents a precompiled SQL statement that can be executed multiple
times with different parameter values. The prepareStatement method of the Connection class returns
a new PreparedStatement object that represents the SQL statement specified by the query parameter.

Yes, in the statement PreparedStatement stmt = conn.prepareStatement(query);, stmt is a new
PreparedStatement object that represents the precompiled SQL statement specified by the query
parameter.
The prepareStatement method of the Connection class creates a new PreparedStatement object and
returns it. You can then use the methods of the PreparedStatement object to set parameter values
and execute the statement.

6) conn.prepareStatement(query) creates a PreparedStatement object for sending parameterized SQL
statements to the database. A SQL statement is precompiled and stored in a PreparedStatement object.
This object can then be used to efficiently execute this statement multiple times.
The query passed to the prepareStatement method is a SQL statement that may contain one or more ‘?’
placeholders. These placeholders represent parameters that will be set later using the various
setXXX methods of the PreparedStatement object. In this case, the query is an INSERT statement that
inserts a new row into the student table with values for the Student_ID, name, major, GPA, and
Hobby columns.
After the PreparedStatement object is created, the code sets the values for each of the placeholders
using the various setXXX methods. For example, stmt.setInt(1, 8) sets the value of the first
placeholder to 8. Once all of the placeholders have been set, the code calls the executeUpdate
method to execute the statement and insert the new row into the database.

7) setString is a method of the PreparedStatement class. It is used to set the value of a specified
parameter to the given Java String value. The driver converts this to an SQL VARCHAR or LONGVARCHAR
value when it sends it to the database.
For example, in the code you provided earlier, stmt.setString(2, "Vaibhav") sets the value of the
second parameter to the String “Vaibhav”. This value will be inserted into the name column of the
new row in the student table.

8) The maximum number of characters that can be stored in a VARCHAR column depends on the specific
database management system being used. For example, in Microsoft SQL Server, the maximum number of
characters that can be stored in a VARCHAR column is 8,0001. However, other database management
systems may have different limits.

9) How a SQL statement is precompiled and stored in a PreparedStatement object ?
Ans)When you create a PreparedStatement object using the prepareStatement method of a Connection
object, the SQL statement passed to the method is sent to the database for precompilation. During
precompilation, the database parses the statement, performs syntax checking, and determines an
execution plan for the statement.
Once the statement has been precompiled, it is stored in the PreparedStatement object. This allows
the statement to be executed more efficiently because the database does not need to repeat the
precompilation process each time the statement is executed.
The exact details of how a SQL statement is precompiled and stored in a PreparedStatement object
may vary depending on the specific database management system being used.

When a database parses a SQL statement, it analyzes the statement to ensure that it is syntactically
correct and can be understood by the database. Parsing involves breaking the statement down into its
individual components (such as keywords, expressions, and operators) and checking that they are used
in a way that is consistent with the rules of the SQL language.
If the statement is found to be syntactically correct during parsing, the database can then proceed
to the next steps of precompilation, such as determining an execution plan for the statement. If the
statement is found to be syntactically incorrect, an error will be returned and the precompilation
process will be aborted.

An execution plan is a detailed description of the steps that the database will take to execute a
SQL statement. The process of determining an execution plan for a statement is known as query
optimization.
During query optimization, the database considers various factors such as the structure of the
tables being queried, the indexes available on those tables, and the data distribution within the
tables. The database uses this information to evaluate different strategies for executing the
statement and selects the strategy that it estimates will be the most efficient.
The exact details of how a database determines an execution plan for a statement may vary depending
on the specific database management system being used. Some databases provide tools that allow you
to view the execution plan for a statement so that you can better understand how the statement
will be executed.

10) Query optimization is the process by which a database management system selects the most
efficient way to execute a SQL statement. The goal of query optimization is to minimize the time
and resources required to execute the statement while still returning the correct results.
Query optimization is a complex process that involves many factors and can vary depending on the
specific database management system being used. Some of the factors that can affect query
optimization include the structure of the tables being queried, the indexes available on those
tables, the data distribution within the tables, and the available system resources.
Query optimization is typically performed automatically by the database management system and
does not require any specific code to be written by the user. However, there are some techniques
that users can employ to help the database optimize their queries more effectively. These
techniques include writing efficient SQL statements, creating appropriate indexes on their tables,
and providing accurate statistics about their data to the database.

11)MySQL, like many other database management systems, uses a cost-based optimizer to automatically
perform query optimization. The cost-based optimizer estimates the cost of different execution
plans for a given query and selects the plan with the lowest estimated cost.
The cost-based optimizer in MySQL considers many factors when estimating the cost of an execution
plan, including the available indexes, the data distribution within the tables, and the available
system resources. MySQL also provides various tools and techniques that users can employ to help
the optimizer make better decisions, such as providing accurate statistics about their data and
using optimizer hints to provide additional information about how a query should be executed.
MySQL is written in C and C++, and its source code is available under the GNU General Public
License. This means that the cost-based optimizer in MySQL is also written in C and C++ and its
source code is open source.
You can download the source code for MySQL from the MySQL website and examine it to learn more about
how the cost-based optimizer works.


 */
