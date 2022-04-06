package io.github.educontessi.hexagonalarchitecture.adapters.out.persistence.mapper;

import io.github.educontessi.hexagonalarchitecture.adapters.out.persistence.entity.BaseEntity;

public interface DataConverter<E extends BaseEntity, M> {

    void modelToEntity(E entity, M model);

    M entityToModel(E entity, String expand);

}
