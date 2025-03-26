package br.com.samuelengcomp.segurancao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.samuelengcomp.segurancao.entidade.Permissao;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Integer>{

}
