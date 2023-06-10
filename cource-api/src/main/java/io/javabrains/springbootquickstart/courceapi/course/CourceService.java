package io.javabrains.springbootquickstart.courceapi.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class CourceService {
	@Autowired
	private CourceRepository courceRepository;
	
	public List<Cource> getAllCorces(){
		
		List<Cource> courceList=new ArrayList<>();
		 courceRepository.findAll().forEach(courceList::add);
				return courceList;
	}

	public Cource getCource(String id) {
		return courceRepository.findById(id).get();
	}
	
	public void addCources(Cource cource) {
		courceRepository.save(cource);
		
	}
	public void updateCource(Cource cource, String id) {
		
		courceRepository.save(cource);
		
	}
	public void deleteCource(String id) {
		courceRepository.deleteById(id);
		
	}
}
