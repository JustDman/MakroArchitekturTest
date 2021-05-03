package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.interfaces.rest;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.application.internal.commandservices.BuchBestelltCommandService;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.BestellId;
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
    public BestellId bestellen() {
        BestellId bestellId = service.bestellen(new BuchBestelltCommand());
        System.out.println("Buch bestellt " + bestellId.getBestellid());
        return bestellId;
    }

}
