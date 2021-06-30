package com.grupo3.romanos;

import com.grupo3.romanos.services.ParserMorse;
import com.grupo3.romanos.services.RomanNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/romano/{p}")
    @ResponseBody
    public String converteRomano(@PathVariable String p) {
        return RomanNumber.toRoman(Integer.parseInt(p));

    }

    @GetMapping("/morse/{p}")
    @ResponseBody
    public String converteMorse(@PathVariable String p) {
        return ParserMorse.decode(p);

    }


}
