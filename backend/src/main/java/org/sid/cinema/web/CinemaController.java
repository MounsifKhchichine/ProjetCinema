package org.sid.cinema.web;

import java.util.List;

import org.sid.cinema.dao.CategorieRepository;
import org.sid.cinema.dao.CinemaRepository;
import org.sid.cinema.dao.FilmRepository;
import org.sid.cinema.dao.PlaceRepository;
import org.sid.cinema.dao.ProjectionRepository;
import org.sid.cinema.dao.SalleRepository;
import org.sid.cinema.dao.SeanceRepository;
import org.sid.cinema.dao.TicketRepository;
import org.sid.cinema.dao.VilleRepository;
import org.sid.cinema.entities.Categorie;
import org.sid.cinema.entities.Cinema;
import org.sid.cinema.entities.Film;
import org.sid.cinema.entities.Place;
import org.sid.cinema.entities.Projection;
import org.sid.cinema.entities.Salle;
import org.sid.cinema.entities.Seance;
import org.sid.cinema.entities.Ticket;
import org.sid.cinema.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CinemaController {

	@Autowired
	private VilleRepository villeRepository;
	@Autowired
	private CinemaRepository cinemaRepository;
	@Autowired
	private SalleRepository salleRepository;
	@Autowired
	private PlaceRepository placeRepository;
	@Autowired
	private SeanceRepository seanceRepository;
	@Autowired
	private CategorieRepository categorieRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private ProjectionRepository projectionRepository;
	@Autowired
	private TicketRepository ticketRepository;

	
	
	@GetMapping(path = "/index")
	public String index() {
		return "index";
	}
	
	@GetMapping(path = "/ville")
	public String listVille(Model model) {
		List<Ville> villes = villeRepository.findAll();
		model.addAttribute("listVilles", villes);
		return "ville";
	}
	
	@GetMapping(path = "/cinema")
	public String listCinema(Model model) {
		List<Cinema> cinemas = cinemaRepository.findAll();
		model.addAttribute("listCinemas", cinemas);
		return "cinema";
	}
	@GetMapping(path = "/salle")
	public String listSalle(Model model) {
		List<Salle> salles = salleRepository.findAll();
		model.addAttribute("listSalles", salles);
		return "salle";
	}
	@GetMapping(path = "/place")
	public String listPlace(Model model) {
		List<Place> places = placeRepository.findAll();
		model.addAttribute("listPlaces", places);
		return "place";
	}
	@GetMapping(path = "/seance")
	public String listSeance(Model model) {
		List<Seance> seances = seanceRepository.findAll();
		model.addAttribute("listSeances", seances);
		return "seance";
	}
	@GetMapping(path = "/categorie")
	public String listCategorie(Model model) {
		List<Categorie> categories = categorieRepository.findAll();
		model.addAttribute("listProjections", categories);
		return "categorie";
	}
	@GetMapping(path = "/film")
	public String listFilm(Model model) {
		List<Film> films = filmRepository.findAll();
		model.addAttribute("listFilms", films);
		return "film";
	}
	@GetMapping(path = "/projection")
	public String listProjection(Model model) {
		List<Projection> projections = projectionRepository.findAll();
		model.addAttribute("listProjections", projections);
		return "projection";
	}
	@GetMapping(path = "/ticket")
	public String listTickect(Model model) {
		List<Ticket> tickets = ticketRepository.findAll();
		model.addAttribute("listFilms", tickets);
		return "ticket";
	}
	
}
