package at.itkollegimst.hofer.pos1makro.test2.druckerei.application.internal.commandservices;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BuchDruckCommandService {

    @Transactional
    public void druckeBuch(String bestellId) {

        System.out.println(String.format("Buch mit der ID %s wird gedruckt", bestellId));
    }
}
