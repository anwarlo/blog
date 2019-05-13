package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class RollDiceController {
    int dice;

    @GetMapping("/roll-dice")
    public String viewRollDice() {
        dice = (int) Math.floor(Math.random() * 6) + 1;
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String viewGuessDice(@PathVariable int n, Model model) {
        model.addAttribute("guess", n);
        model.addAttribute("dice", dice);
        return "guess-dice";
    }
}
