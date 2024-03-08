package trabalho15_JDBC_deletar.src.db;

public class DbIntegrityException  extends RuntimeException{

    public DbIntegrityException(String msg){
        super(msg);
    }
}
