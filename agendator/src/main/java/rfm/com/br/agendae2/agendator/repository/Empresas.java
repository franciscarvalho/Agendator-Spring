package rfm.com.br.agendae2.agendator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rfm.com.br.agendae2.agendator.model.Empresa;


@Repository
public interface Empresas extends JpaRepository<Empresa, Long>{

}
