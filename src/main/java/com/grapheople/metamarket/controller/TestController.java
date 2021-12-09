package com.grapheople.metamarket.controller;

import lombok.AllArgsConstructor;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
@AllArgsConstructor
public class TestController {
    private final StringEncryptor stringEncryptor;

    @GetMapping("encrypt")
    public String testEncrypt(@RequestParam String string) {
        return stringEncryptor.encrypt(string);
    }

    @GetMapping("decrypt")
    public String testDecrypt(@RequestParam String string) {
        return stringEncryptor.decrypt(string);
    }
}
