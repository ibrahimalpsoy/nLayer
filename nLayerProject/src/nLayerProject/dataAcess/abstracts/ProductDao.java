package nLayerProject.dataAcess.abstracts;

import java.util.List;

import nLayerProject.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
}
