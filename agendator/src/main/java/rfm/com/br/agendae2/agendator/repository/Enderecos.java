package rfm.com.br.agendae2.agendator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rfm.com.br.agendae2.agendator.model.Endereco;

@Repository
public interface Enderecos extends JpaRepository<Endereco, Long>{

}
