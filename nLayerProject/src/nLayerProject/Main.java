package nLayerProject;

import java.util.List;

import nLayerProject.business.abstracts.ProductService;
import nLayerProject.business.concretes.ProductManager;
import nLayerProject.core.JloggerManagerAdapter;
import nLayerProject.dataAcess.concretes.HibernateProductDao;
import nLayerProject.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao(), new JloggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12);
		productService.add(product);
	}
}
