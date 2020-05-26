package com.verygood.security.coding;

public interface Encryption {
  String encrypt(String text);
  String decrypt(String encryptedData);
}
