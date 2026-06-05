package rvt;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class ToDoDB {

    
    
    //private Connetion connect() throws SQLException
    private void initSchema() {
        String sql = "CREATE TABLE IF NOT EXISTS todo(" + "id INTEGER PRIMARY KEY" + "task TEXT NOT NULL) STRICT";
        
        try(Connection conn = connect();
         Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        }
        catch (SQLException e){
            throw new RuntimeErrorException("Schema init failed" + e.getMessage());
        }
    }
}
