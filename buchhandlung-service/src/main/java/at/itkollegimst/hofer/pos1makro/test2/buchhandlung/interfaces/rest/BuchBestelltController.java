package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.interfaces.rest;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.application.internal.commandservices.BuchBestelltCommandService;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.commands.BuchBestelltCommand;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/buchbestellt")
public class BuchBestelltController {

    @Autowired
    private BuchBestelltCommandService service;

    @PostMapping
    @ResponseBody
    public Long bestellen() {
        Long id = service.bestellen(new BuchBestelltCommand(Status.BESTELLT));
        System.out.println("Buch bestellt " + id);
        return id;
    }

}
