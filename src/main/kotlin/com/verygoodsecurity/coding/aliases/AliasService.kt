package com.verygoodsecurity.coding.aliases

import org.springframework.stereotype.Service

interface AliasService {
  fun redact(secret: String): String
}

@Service
class DefaultAliasService: AliasService {
  override fun redact(secret: String): String = secret
}
