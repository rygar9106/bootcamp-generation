package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.SalonModel;
import com.example.demo.services.SalonService;

@RestController
public class EscuelaController {
	private final SalonService salonService;
	
	public EscuelaController(@Autowired SalonService salonService){
		this.salonService = salonService;
	}
	
	//Mostrat datos del salon
	@GetMapping("/salon")
	public ArrayList<SalonModel> obtenerDatos(){
		return salonService.obtenerDatos();
	}
	@PostMapping("/salon")
	public SalonModel guardatDatos(@RequestBody SalonModel salonModel) {
		return salonService.guardardatos(salonModel);
	}
	//Eliminar dato
	@DeleteMapping(path = "/salon/{id}")
	public boolean eliminarDato(@PathVariable ("id") Integer id) {
		return salonService.EliminarDatos(id);
	}
}
