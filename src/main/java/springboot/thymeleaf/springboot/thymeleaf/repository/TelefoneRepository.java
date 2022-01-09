package springboot.thymeleaf.springboot.thymeleaf.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springboot.thymeleaf.springboot.thymeleaf.model.Telefone;

@Repository
@Transactional
public interface TelefoneRepository extends CrudRepository<Telefone, Long> {

}
