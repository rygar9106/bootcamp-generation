package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.SalonModel;
import com.example.demo.repositories.SalonRepository;

@Service
public class SalonService {
	private final SalonRepository salonRepository;
	
	public SalonService(@Autowired SalonRepository salonRepository) {
		this.salonRepository = salonRepository;
	}
	//Mostrat datos de Salon
	public ArrayList<SalonModel> obtenerDatos(){
		return (ArrayList<SalonModel>)salonRepository.findAll();
	}
	
	//Guardar datos en tabla salon
	public SalonModel guardardatos(SalonModel salonModel) {
		return salonRepository.save(salonModel);
	}
	
	//Eliminar datos
	
	public boolean EliminarDatos(Integer id) {
		try {
			salonRepository.deleteById(id);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
}
