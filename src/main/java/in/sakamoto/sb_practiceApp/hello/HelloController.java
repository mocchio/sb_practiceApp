package in.sakamoto.sb_practiceApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        // hello.htmlの呼び出し
        return "hello";
    }
}
