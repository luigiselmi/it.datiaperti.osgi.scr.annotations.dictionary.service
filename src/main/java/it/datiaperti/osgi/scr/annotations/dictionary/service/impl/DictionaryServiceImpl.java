package it.datiaperti.osgi.scr.annotations.dictionary.service.impl;
 
import it.datiaperti.osgi.scr.annotations.dictionary.service.api.DictionaryService;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Service;
import org.apache.felix.scr.annotations.Property;
import org.osgi.service.component.ComponentContext;


@Component(immediate=true)
@Service(value=DictionaryService.class) 
@Properties ({
		@Property(name="service.name", value="Dictionary Service based on SCR Annotations")
		  
})
public class DictionaryServiceImpl implements DictionaryService {

	String[] m_dictionary = { "welcome", "to", "the", "osgi", "tutorial" };
 
	public boolean checkWord(String word) {

		word = word.toLowerCase();
		
		for (int i = 0; i < this.m_dictionary.length; i++) {

			if (this.m_dictionary[i].equals(word)) {
				
				return true;
			}
		}

		return false;
	}
	
	protected void activate(ComponentContext context) {

		System.out.println("Dictionary Service Activated");
	}
 

	protected void deactivate(ComponentContext context) {

		System.out.println("Dictionary Service Deactivated");

	}

	
}
