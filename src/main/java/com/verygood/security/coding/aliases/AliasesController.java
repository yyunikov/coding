package com.verygood.security.coding.aliases;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/aliases")
public class AliasesController {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<String> createAlias(@RequestBody final AliasCreateRequest createRequest){
    log.info("Creating alias for: " + createRequest.getSecret());
    return new ResponseEntity<>("Created", HttpStatus.CREATED);
  }

}
