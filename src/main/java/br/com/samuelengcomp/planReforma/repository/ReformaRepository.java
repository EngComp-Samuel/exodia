package br.com.samuelengcomp.planReforma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.samuelengcomp.planReforma.entidade.Reforma;

@Repository
public interface ReformaRepository extends JpaRepository<Reforma, Integer>{

}
