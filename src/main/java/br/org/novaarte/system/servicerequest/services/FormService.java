package br.org.novaarte.system.servicerequest.services;

import br.org.novaarte.system.servicerequest.entities.Form;
import br.org.novaarte.system.servicerequest.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {

	// Autowired means to get the bean called formRepository automatically created by Spring
		@Autowired
		private FormRepository formRepository;
		
//		@Autowired
//		private ArtistRepository artistRepository;
		
		public Form insert(Form form) {
//			artistRepository.saveAll(form.getEvent().getArtists());
			return formRepository.save(form);
		}
}
