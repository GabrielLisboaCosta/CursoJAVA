package trabalho16_JDBC_projetoDAO.src.model.dao;

import trabalho16_JDBC_projetoDAO.src.model.entites.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
