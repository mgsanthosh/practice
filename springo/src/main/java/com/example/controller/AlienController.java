package com.example.controller;

import com.example.dao.AlienRepo;
import com.example.data.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
    @Autowired
    AlienRepo alienRepo;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien) {
        alienRepo.save(alien);
        return "home.jsp";
    }

    @RequestMapping("/getAlien")
        public ModelAndView getAlien(@RequestParam int aid) {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("showAlien.jsp");
            Alien alien = alienRepo.findById(aid).orElse(new Alien());
            mv.addObject(alien);
            return mv;
    }
}
