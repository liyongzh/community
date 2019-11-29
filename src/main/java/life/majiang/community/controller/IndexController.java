package life.majiang.community.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author 李勇志
 * @create 2019-11-28 18:14
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() { return "index"; }
}
