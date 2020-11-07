package pkunk.wlp.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DocsController {

    @GetMapping
    public String docs() {
        return "forward:/swagger-ui.html";
    }
}
