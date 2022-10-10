package mds.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

        @GetMapping("static_page")
        public String staticPage(){
            return "staticpage";
        }

        @GetMapping("dynamic_page")
        public String dynamicPage(Model model){

            model.addAttribute("name", "David");
            return "dynamicpage";
        }

        @GetMapping("myself")
        public String myself(){

            return "myselfhtml";
        }

        @GetMapping("alice")
        public String alice(Model model){
            model.addAttribute("name","alice");
            model.addAttribute("person", "Alice");
            return "template";
        }

        @GetMapping("bob")
        public String bob(Model model){
            model.addAttribute("name","bob");
            model.addAttribute("person", "Bob");
            return "template";
        }


}
