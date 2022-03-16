package br.com.godoydev.festa.controller;

import br.com.godoydev.festa.model.Computador;
import br.com.godoydev.festa.repository.Computadores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/computadores")
public class ComputadorController {

    @Autowired
    private Computadores computadores;

    @GetMapping
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("ListaComputadores");
        mv.addObject(new Computador());
        mv.addObject("computadores", computadores.findAll());
        return mv;
    }

    @PostMapping
    public String salvar(Computador computador){
        this.computadores.save(computador);
        return "redirect:/computadores";
    }
}
