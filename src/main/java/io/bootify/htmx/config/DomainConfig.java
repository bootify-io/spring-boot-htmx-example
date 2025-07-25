package io.bootify.htmx.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("io.bootify.htmx")
@EnableJpaRepositories("io.bootify.htmx")
@EnableTransactionManagement
public class DomainConfig {
}
