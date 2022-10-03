package mds.uvod;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("basic")
public class BasicController {

    @GetMapping
    public String testBasic(){

        return "hello";

    }

    @GetMapping("list")
    public List<String> testList(){

        return List.of("Hello","world","!");

    }


    @GetMapping("test1")
    public String testParam1(@RequestParam(defaultValue = "default", name = "jmeno") String name){
        return String.format("Hello"+name+"!");
    }

    @GetMapping("test3")
    public String testParam3(@RequestParam List<String> id ){

        return "All IDs are: "+id;

    }

    @GetMapping("form")
    public String helloForm(){
        String html = "<html>" +
                "<body>"+
                "<form method='post' action='hello'>"+
                "<input type='text' name='name'/>"+
                "<input type='submit' value='Pozdrav!'/>"+
                "</form>"+
                "</body>"+
                "</html>";

        return html;
    }

    @RequestMapping(value="hello", method = RequestMethod.POST)
    public String helloTest(@RequestParam String name){

        return String.format("Hello "+name+"!");


    }



}
