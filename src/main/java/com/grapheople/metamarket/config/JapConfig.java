package com.grapheople.metamarket.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEncryptableProperties
@EnableJpaRepositories(basePackages = "com.grapheople.metamarket.repository")
public class JapConfig {
}
