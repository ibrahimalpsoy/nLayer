package nLayerProject.business.abstracts;

import java.util.List;

import nLayerProject.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
