package com.ecommerce.proyecto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.proyecto.model.Producto;
import com.ecommerce.proyecto.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);
		
	}

	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);
		
	}

	
}
