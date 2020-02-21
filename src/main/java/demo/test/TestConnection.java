package demo.test;

import java.sql.*;

public class TestConnection {
    private final String url = "jdbc:postgresql://localhost:5432/tatprog";
    private final String user = "postgres";
    private final String password = "12345";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void AddToDB(){
        String SQL = "INSERT INTO Supplier(email,city) "
                + "VALUES(?,?)";

        long id = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, "person.getFirstName()");
            pstmt.setString(2, "person.getLastName()");
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        TestConnection tc = new TestConnection();
        tc.connect();
//        tc.AddSmthToDB();
    }
}


