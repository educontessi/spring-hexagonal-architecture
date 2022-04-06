package io.github.educontessi.hexagonalarchitecture.core.exception;

import java.io.Serial;
import java.util.UUID;

public class EntityNotFoundException extends BusinessException {

    @Serial
    private static final long serialVersionUID = 2418133965202445456L;

    public EntityNotFoundException(String mensagem) {
        super(mensagem);
    }

    public EntityNotFoundException(Long id) {
        this(String.format("There is no record with code %d", id));
    }

    public EntityNotFoundException(UUID id) {
        this(String.format("There is no record with code %s", id.toString()));
    }

}
