package trabalho15_JDBC_deletar.src.application;

import trabalho12_JDBC.src.db.DB;
import trabalho13_JDBC_inserir.src.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rwos1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            /*int x = 1;
            if(x < 2){
                throw new SQLException("Fake error");
            }*/

            int rwos2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println("Rows1: " + rwos1);
            System.out.println("Rows2: " + rwos2);
        }
        catch (SQLException e){
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by:" + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Cause by: " + ex.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}