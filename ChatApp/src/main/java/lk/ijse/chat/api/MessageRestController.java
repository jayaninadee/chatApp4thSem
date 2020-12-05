package lk.ijse.chat.api;

import lk.ijse.chat.dto.MessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class MessageRestController {
    @GetMapping("/api/hello")
    public MessageDTO greeting() {
//        Message msg = new Message("Akash", "Hello", new Date());
//        return msg;
        return null;
    }

    @GetMapping("/api/message")
    public MessageDTO messageBuilder(@RequestParam("user") String user, @RequestParam("message") String message) {
//        Message msg = new Message(user, message, new Date());
//        return msg;
        return null;
    }

    @PostMapping(value = "/api/message", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createMessage(@RequestBody MessageDTO message) {
        message.setDate(new Date());
        return new ResponseEntity(message, HttpStatus.OK);
    }
}
