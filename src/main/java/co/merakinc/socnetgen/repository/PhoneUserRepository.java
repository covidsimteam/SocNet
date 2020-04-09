package co.merakinc.socnetgen.repository;

import co.merakinc.socnetgen.domain.PhoneUser;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PhoneUserRepository extends Neo4jRepository<PhoneUser, Long> {
}
