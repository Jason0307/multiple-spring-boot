package org.zhubao;

import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("two")
@RestController
public class TwoController {

    @GetMapping("/two")
    public ResponseEntity<String> two() {
        return new ResponseEntity<String>("two", HttpStatus.OK);
    }
}
