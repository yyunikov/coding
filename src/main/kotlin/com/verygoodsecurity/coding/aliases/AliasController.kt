package com.verygoodsecurity.coding.aliases

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

data class AliasRequest(val secret: String)

data class AliasResponse(val alias: String)

@RestController
@RequestMapping("/aliases")
class AliasController(val aliasService: AliasService) {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  fun create(@RequestBody createRequest: AliasRequest) = AliasResponse(aliasService.redact(createRequest.secret))
}
