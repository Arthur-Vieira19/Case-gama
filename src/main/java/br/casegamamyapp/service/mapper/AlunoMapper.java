package br.casegamamyapp.service.mapper;

import br.casegamamyapp.domain.Aluno;
import br.casegamamyapp.service.dto.AlunoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Aluno} and its DTO {@link AlunoDTO}.
 */
@Mapper(componentModel = "spring")
public interface AlunoMapper extends EntityMapper<AlunoDTO, Aluno> {}
