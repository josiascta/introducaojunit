package testeunitario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testeunitario.service.ExemploService;

@RestController
@RequestMapping("/teste")
public class ExemploController {
    
    private final ExemploService exemploService;

    public ExemploController(ExemploService exemploService){
        this.exemploService = exemploService;
    }

    @GetMapping
    public int teste(){
        return exemploService.somaValores(1, 2);
    }
}
