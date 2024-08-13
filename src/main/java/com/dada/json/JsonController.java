package com.dada.json;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class JsonController {

    private final JsonRepository jsonRepository;


    @GetMapping("/sum")
    String list (Model model) {
        List<Json> jsons = jsonRepository.findAll();

        model.addAttribute("jsons", jsons);

        return "list.html";
    }
}

