package io.javabrains.springbootquickstart.courceapi.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourceRepository extends CrudRepository<Cource, String>{
	

}
	
	
	/*public List<Cource> getAllCorces(){
		return null;
	}

	public Cource getCource(String id) {
		return null;
	}
	
	public void addCources(Cource cource) {
		
	}
	public void updateCource(Cource cource) {
		
	}
	public void deleteCource(String id) {
		
	}
*/


