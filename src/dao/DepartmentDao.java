package dao;

import entitities.Department;

import java.net.DatagramPacket;
import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void delete(Department obj);
    Department findById (Integer integer);
    List<Department> findAll();
}
