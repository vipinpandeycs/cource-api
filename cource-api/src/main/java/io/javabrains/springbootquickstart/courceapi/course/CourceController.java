package io.javabrains.springbootquickstart.courceapi.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourceController {
	@Autowired
	private CourceService courceService;
	
		@RequestMapping("/cources")
		public List<Cource> getAllCources(){
			return courceService.getAllCorces();
			
		}
		
		@RequestMapping("/cources/{id}")
		public Cource getCource(@PathVariable String id) {
			return courceService.getCource(id);
			
		}
		
		@RequestMapping(method=RequestMethod.POST,value="/cources")
		public void addCoure(@RequestBody Cource cource) {
			courceService.addCources(cource);
			
		}
		
		@RequestMapping(method=RequestMethod.PUT,value="/cources/{id}")
		public void updateCource(@RequestBody Cource cource,@PathVariable String id) {
			courceService.updateCource(cource,id);
		
			
		}
		
		@RequestMapping(method=RequestMethod.DELETE,value="/cources/{id}")
		public void deleteCource(@PathVariable String id) {
			courceService.deleteCource(id);
			
		}
		

}
