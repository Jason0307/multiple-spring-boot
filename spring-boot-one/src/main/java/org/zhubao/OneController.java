package org.zhubao;

import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("one")
@RestController
public class OneController {

    @GetMapping("/one")
    public ResponseEntity<String> one() {
        return new ResponseEntity<String>("one", HttpStatus.OK);
    }
}
