package az.dea.db;

import java.sql.*;

public class Connector {
    protected Connection connection;
    protected PreparedStatement statement;
    protected ResultSet resultSet;

    protected void connect() throws ClassNotFoundException, SQLException {
        String username = "root";
        String pass = "root";
        String URL = "jdbc:mysql://localhost:3306/dea_rest";
        String dbClass = "com.mysql.jdbc.Driver";
        Class.forName(dbClass);
        connection = DriverManager.getConnection(URL, username, pass);
    }

    protected void disconnect() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
