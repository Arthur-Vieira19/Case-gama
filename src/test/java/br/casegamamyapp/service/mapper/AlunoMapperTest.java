package br.casegamamyapp.service.mapper;

import static br.casegamamyapp.domain.AlunoAsserts.*;
import static br.casegamamyapp.domain.AlunoTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoMapperTest {

    private AlunoMapper alunoMapper;

    @BeforeEach
    void setUp() {
        alunoMapper = new AlunoMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getAlunoSample1();
        var actual = alunoMapper.toEntity(alunoMapper.toDto(expected));
        assertAlunoAllPropertiesEquals(expected, actual);
    }
}
