package trabalho16_JDBC_projetoDAO.src.model.dao;

import trabalho16_JDBC_projetoDAO.src.model.entites.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
