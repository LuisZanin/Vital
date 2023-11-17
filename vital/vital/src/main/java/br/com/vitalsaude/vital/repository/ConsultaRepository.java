package br.com.vitalsaude.vital.repository;

import br.com.vitalsaude.vital.consultas.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
