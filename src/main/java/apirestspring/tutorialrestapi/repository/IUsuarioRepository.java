package apirestspring.tutorialrestapi.repository;

import apirestspring.tutorialrestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
