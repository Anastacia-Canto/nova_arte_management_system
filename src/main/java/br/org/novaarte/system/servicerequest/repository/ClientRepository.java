package br.org.novaarte.system.servicerequest.repository;

import br.org.novaarte.system.servicerequest.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {}
