package com.example.demo.services;


import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService
{
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts()
    {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id)
    {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    @Override
    public void deleteById(Integer id)
    {
        this.productRepository.deleteById(id);
    }


}
