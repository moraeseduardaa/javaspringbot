package com.moraes.school.repositories;

import com.moraes.school.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository  extends JpaRepository<AlunoModel,Long> {


}
