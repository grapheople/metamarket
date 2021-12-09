package com.grapheople.metamarket.jasypt;

import com.grapheople.metamarket.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Assertions;

/**
 * Created by 지성인 on 2021-12-04.
 */


@ExtendWith(SpringExtension.class)
@Slf4j
public class JasyptTest {

    @Test
    public void jasyptTest() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword("test");
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);


        String url = "test";
        String user = "test";
        String password = "test";

        String encryptedUrl = encryptor.encrypt(url);
        String encryptedUser = encryptor.encrypt(user);
        String encryptedPassword = encryptor.encrypt(password);

        log.info(encryptedUrl);
        log.info(encryptedUser);
        log.info(encryptedPassword);

        Assertions.assertEquals(url, encryptor.decrypt(encryptedUrl));
        Assertions.assertEquals(user, encryptor.decrypt(encryptedUser));
        Assertions.assertEquals(password, encryptor.decrypt(encryptedPassword));
    }
}
