package com.example.ems.audit;

import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // In real apps, use Spring Security for logged-in user
        return Optional.of("Raji"); // Hardcoded user for example
    }
}
