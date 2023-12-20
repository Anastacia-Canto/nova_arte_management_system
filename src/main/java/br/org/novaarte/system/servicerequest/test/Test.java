package br.org.novaarte.system.servicerequest.test;

import br.org.novaarte.system.servicerequest.entities.Artist;
import br.org.novaarte.system.servicerequest.entities.Client;
import br.org.novaarte.system.servicerequest.entities.Event;
import br.org.novaarte.system.servicerequest.entities.Form;
import br.org.novaarte.system.servicerequest.repository.ArtistRepository;
import br.org.novaarte.system.servicerequest.repository.ClientRepository;
import br.org.novaarte.system.servicerequest.repository.EventRepository;
import br.org.novaarte.system.servicerequest.repository.FormRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

@Component
public class Test implements CommandLineRunner {

    private final ArtistRepository artistRepository;
    private final ClientRepository clientRepository;
    private final EventRepository eventRepository;
    private final FormRepository formRepository;

    public Test(ArtistRepository artistRepository, ClientRepository clientRepository, EventRepository eventRepository, FormRepository formRepository) {
        this.artistRepository = artistRepository;
        this.clientRepository = clientRepository;
        this.eventRepository = eventRepository;
        this.formRepository = formRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Artist artist = new Artist("Marielza Tiscate", "Música", Arrays.asList("Violão"), 1);

        Client client = new Client("Anastácia Canto", "anastacia@email.com", 215487963);

        Event event = new Event("Show da Marielza",
                LocalDateTime.of(2024, Month.JANUARY, 20, 18, 0),
                LocalDateTime.of(2024, Month.JANUARY, 20, 19, 0),
                "Avenida São Félix 601 Vista Alegre", "Lona Cultural de Vista Alegre", 800);

        Form form = new Form(client, event, true, true, true, "");


        client.setForm(form);


        event.getArtists().add(artist);
        event.setForm(form);

        artist.setShowBeginning(LocalDateTime.of(2024, Month.JANUARY, 20, 18, 0));
        artist.setShowEnding(LocalDateTime.of(2024, Month.JANUARY, 20, 20, 0));

        formRepository.save(form);
        clientRepository.save(client);
        eventRepository.save(event);
        artistRepository.save(artist);

        System.out.println("----------------CHECKING------------------");
        System.out.println("Form: " + form);
        System.out.println("Event: " + event);

    }
}
