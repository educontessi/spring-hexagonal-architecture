package io.github.educontessi.hexagonalarchitecture.adapters.out.persistence.mapper;

import io.github.educontessi.hexagonalarchitecture.adapters.out.persistence.entity.CountryEntity;
import io.github.educontessi.hexagonalarchitecture.core.model.Country;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper implements DataConverter<CountryEntity, Country> {

    @Override
    public void modelToEntity(CountryEntity entity, Country model) {
        BeanUtils.copyProperties(model, entity);
    }

    @Override
    public Country entityToModel(CountryEntity entity, String expand) {
        Country model = new Country();
        BeanUtils.copyProperties(entity, model);
        return model;
    }

    public Country entityToModel(CountryEntity entity) {
        return entityToModel(entity, null);
    }

}
