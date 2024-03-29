package trabalho16_JDBC_projetoDAO.src.model.dao;

import trabalho16_JDBC_projetoDAO.src.db.DB;
import trabalho16_JDBC_projetoDAO.src.model.dao.impl.DepartmentDaoJDBC;
import trabalho16_JDBC_projetoDAO.src.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
