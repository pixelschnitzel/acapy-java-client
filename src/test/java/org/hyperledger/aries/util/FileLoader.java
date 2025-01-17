/*
 * Copyright (c) 2020-2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.util;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Slf4j
public class FileLoader {

    public String load(String filename) {
        String result = "";
        String fn;

        if (!filename.contains(".")) {
            fn = filename + ".json";
        } else {
            fn = filename;
        }

        InputStream is = getClass().getClassLoader().getResourceAsStream(fn);
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            result =  buffer.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            log.error("Could not read from input stream.", e);
        }

        return result;
    }

    public static FileLoader newLoader() {
        return new FileLoader();
    }
}