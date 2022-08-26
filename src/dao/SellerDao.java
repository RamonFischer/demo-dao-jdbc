package dao;

import entitities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void delete(Seller obj);
    Seller findById (Integer integer);
    List<Seller> findAll();
}
