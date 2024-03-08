package trabalho16_JDBC_projetoDAO.src.application;

import trabalho16_JDBC_projetoDAO.src.model.dao.DaoFactory;
import trabalho16_JDBC_projetoDAO.src.model.dao.SellerDao;
import trabalho16_JDBC_projetoDAO.src.model.entites.Seller;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);


        System.out.println(seller);
    }
}