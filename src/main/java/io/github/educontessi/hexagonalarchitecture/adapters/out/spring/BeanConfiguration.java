package io.github.educontessi.hexagonalarchitecture.adapters.out.spring;

import io.github.educontessi.hexagonalarchitecture.adapters.out.persistence.service.CountryService;
import io.github.educontessi.hexagonalarchitecture.core.usecase.CountryUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    CountryUseCaseImpl countryUseCaseImpl(CountryService service) {
        return new CountryUseCaseImpl(service);
    }
}
