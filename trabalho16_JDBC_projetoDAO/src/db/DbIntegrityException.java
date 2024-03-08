package trabalho16_JDBC_projetoDAO.src.db;

public class DbIntegrityException  extends RuntimeException{

    public DbIntegrityException(String msg){
        super(msg);
    }
}
