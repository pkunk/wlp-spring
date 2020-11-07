package pkunk.wlp.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
public class SimpleController {

    @GetMapping
    public List<Integer> getList() {
        return List.of(1, 2, 3, 4, 5);
    }
}
