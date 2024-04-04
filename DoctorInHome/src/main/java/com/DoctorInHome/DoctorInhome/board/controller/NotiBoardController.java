package com.DoctorInHome.DoctorInhome.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class NotiBoardController {

    @GetMapping("/noti")
    public String notiPage(){
        return "board/notiBoard";
    }

    @GetMapping("/noti/{detail}")
    public String notiDetailPage(@PathVariable("detail") String path){
        return "board/" + path;
    }
}
