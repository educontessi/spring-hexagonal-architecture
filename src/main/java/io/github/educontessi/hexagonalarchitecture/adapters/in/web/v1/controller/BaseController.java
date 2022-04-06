package io.github.educontessi.hexagonalarchitecture.adapters.in.web.v1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public abstract class BaseController<E> {

    protected ResponseEntity<E> created(Long id, E entity) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).body(entity);
    }

}
