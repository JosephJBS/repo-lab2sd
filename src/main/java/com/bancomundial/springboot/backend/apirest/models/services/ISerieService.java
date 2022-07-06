package com.bancomundial.springboot.backend.apirest.models.services;

import com.bancomundial.springboot.backend.apirest.models.entity.Serie;

import java.util.List;

public interface ISerieService {

	//public List<Serie> findAll();
	public List<Serie> findBySeriesCode(String seriesCode) throws Exception;
	public List<Serie> findBySeriesCodeAndCountryCode(String seriesCode, String countryCode) throws Exception;
	public List<Serie> conexionAzure() throws Exception;
}

