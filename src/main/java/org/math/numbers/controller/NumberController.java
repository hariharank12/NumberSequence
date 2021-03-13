package org.math.numbers.controller;
import lombok.extern.slf4j.Slf4j;
import org.math.numbers.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Number Controller to generate sequence of Numbers.
 * Created by hariharank12 on 13/03/21.
 */
@Slf4j
@Controller
public class NumberController {

    @Autowired
    private NumberService numberService;

    @ResponseBody
    @RequestMapping("/numbers")
    public Map<String, Object> numbers() {
      log.debug("Retrieve Number Sequence");
      return numberService.getNumbers();
    }
}