package nLayerProject.business.concretes;

import java.util.List;

import nLayerProject.business.abstracts.ProductService;
import nLayerProject.core.LoggerService;
import nLayerProject.dataAcess.abstracts.ProductDao;
import nLayerProject.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		
		if (product.getCategoryId() == 1) {
			System.out.println("bu kategoride �r�n kabul edilmiyor.");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logSystem("�r�n eklendi");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
