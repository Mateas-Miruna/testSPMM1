package com.example.testspmm1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class RezultateController {

    private final MesajService mesajService;

    public RezultateController(MesajService mesajService) {
        this.mesajService = mesajService;
    }
//sablon lab 6 Dependency Injection. Controller
    @GetMapping
    public List<String> getRezultate() {
        return mesajService.getRezultate();
    }
}
