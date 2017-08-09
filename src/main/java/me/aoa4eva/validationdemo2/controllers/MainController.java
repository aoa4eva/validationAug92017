package me.aoa4eva.validationdemo2.controllers;

import me.aoa4eva.validationdemo2.models.TvShow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    @GetMapping("/tvform")
    public String addTVShow(Model model)
    {
        model.addAttribute("tvshow",new TvShow());
        return "tvform";
    }

    @PostMapping("/tvform")
    public String showTVShow(@Valid @ModelAttribute ("tvshow") TvShow tvShow, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "tvform";
        }

        return "tvshowconfirm";
    }
}
