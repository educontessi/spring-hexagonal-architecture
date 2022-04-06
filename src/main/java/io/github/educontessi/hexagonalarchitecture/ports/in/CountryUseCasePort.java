package io.github.educontessi.hexagonalarchitecture.ports.in;

import io.github.educontessi.hexagonalarchitecture.core.filter.CountryFilter;
import io.github.educontessi.hexagonalarchitecture.core.model.Country;
import io.github.educontessi.hexagonalarchitecture.core.usecase.validation.Validator;

import java.util.List;

public interface CountryUseCasePort {

    List<Country> findAll();

    Object search(CountryFilter filter, Object pageable);

    Country findById(Long id);

    Country save(Country model, List<Validator> validators);

    Country update(Long id, Country model, List<Validator> validators);

    void delete(Long id, List<Validator> validators);
}
