package io.github.educontessi.hexagonalarchitecture.adapters.out.persistence.repository.customquery;

import io.github.educontessi.hexagonalarchitecture.adapters.out.persistence.entity.CountryEntity;
import io.github.educontessi.hexagonalarchitecture.core.filter.CountryFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CountryRepositoryQuery {

    Page<CountryEntity> search(CountryFilter filter, Pageable pageable);

}
