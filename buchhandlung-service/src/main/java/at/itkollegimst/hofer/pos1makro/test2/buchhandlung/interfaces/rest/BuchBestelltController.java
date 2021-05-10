package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.interfaces.rest;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.application.internal.commandservices.BuchBestelltCommandService;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.BestellId;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellung;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.commands.BuchBestelltCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buchbestellt")
public class BuchBestelltController {

    @Autowired
    private BuchBestelltCommandService service;

    @GetMapping
    public List<Bestellung> getBestellungen() {
        return service.listAll();
    }

    @PostMapping
    @ResponseBody
    public BestellId bestellen() {
        BestellId bestellId = service.bestellen(new BuchBestelltCommand());
        System.out.println("Buch bestellt " + bestellId.getBestellid());
        return bestellId;
    }

}
