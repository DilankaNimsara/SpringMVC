package lk.epic.controller;

import lk.epic.mode.Student;
import lk.epic.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    @Autowired
    Messages messages;

    @GetMapping
    public ResponseEntity getValue() {
        return ResponseEntity.ok(messages.getMessage());
    }
}
