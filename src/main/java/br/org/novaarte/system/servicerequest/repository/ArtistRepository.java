package br.org.novaarte.system.servicerequest.repository;

import br.org.novaarte.system.servicerequest.entities.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called formRepository
// It is about CRUD

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Integer> {}


