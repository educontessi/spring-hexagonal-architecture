package io.github.educontessi.hexagonalarchitecture.core.usecase.validation;

import io.github.educontessi.hexagonalarchitecture.core.model.Country;
import io.github.educontessi.hexagonalarchitecture.core.usecase.validation.businessrule.ObjectNotNull;

import java.util.ArrayList;
import java.util.List;

public class CountryValidations {

    private CountryValidations() {
        throw new IllegalStateException("Utility class");
    }

    public static List<Validator> validationsOnSave(Country country) {
        List<Validator> validators = new ArrayList<>();
        validators.add(new ObjectNotNull(country));
        return validators;
    }

    public static List<Validator> validationsOnDelete() {
        return new ArrayList<>();
    }
}
