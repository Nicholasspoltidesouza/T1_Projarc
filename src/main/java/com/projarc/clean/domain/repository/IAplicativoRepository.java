package com.projarc.clean.domain.repository;

import com.projarc.clean.domain.entity.Aplicativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAplicativoRepository extends JpaRepository<Aplicativo, Long> {
}
