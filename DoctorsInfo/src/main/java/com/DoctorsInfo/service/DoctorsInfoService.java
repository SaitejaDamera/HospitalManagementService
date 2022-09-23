package com.DoctorsInfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.DoctorsInfo.entity.Doctors;
import com.DoctorsInfo.repository.DoctorsInfoRepository;

@Service
@ComponentScan
@ConfigurationProperties
public class DoctorsInfoService {
	
	@Autowired
	private DoctorsInfoRepository doctorsInfoRepository;

	public void createDoctorsInfo(Doctors doctors) {
		// TODO Auto-generated method stub
		doctorsInfoRepository.save(doctors);	
	}

	public Object getDoctorsById(Long id) {
		// TODO Auto-generated method stub
		return doctorsInfoRepository.findById(id).get();
	}

	public List<Doctors> getAllDoctorsInfo() {
		// TODO Auto-generated method stub
		return doctorsInfoRepository.findAll();
	}

	public void deleteDoctorsById(Long id) {
		// TODO Auto-generated method stub
	    doctorsInfoRepository.deleteById(id);
	}

	public void updateDoctorInfo(Doctors doctors) {
		// TODO Auto-generated method stub
		doctorsInfoRepository.save(doctors);
		
	}

}
