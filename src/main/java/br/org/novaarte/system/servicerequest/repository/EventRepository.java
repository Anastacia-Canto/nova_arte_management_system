package br.org.novaarte.system.servicerequest.repository;

import br.org.novaarte.system.servicerequest.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {}
