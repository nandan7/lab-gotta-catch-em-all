package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
           Bulbasaur bulb=new Bulbasaur("Bulbasaur",001, "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."  , "POISON", "IVYSAUR",64);
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			  
			msg = "<center>" + bulb.getPokemonName() + "  #" + bulb.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bulb.getCharacteristics());
			request.setAttribute("type1",bulb.getType());
			request.setAttribute("evolution1", bulb.getEvolution());
			request.setAttribute("baseExp1", bulb.getBaseExp());
		
		}

		if (value2 != null) {
        	Charizard chari=new Charizard("Charizard",006, "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",  "FIRE" , "CHARMELEON",240);
			
			// Create the object for Charizard class and use getters to retrieve the values	
			  
			msg = "<center>" + chari.getPokemonName() + "  #" + chari.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", chari.getCharacteristics());
			request.setAttribute("type1",chari.getType());
			request.setAttribute("evolution1", chari.getEvolution());
			request.setAttribute("baseExp1", chari.getBaseExp());
		}

		if (value3 != null) {
            Dragonite drag=new Dragonite("Dragonite",149,  "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.","DRAGON" ,"DRATINI" ,270);
			
			// Create the object for Dragonite class and use getters to retrieve the values	
			  
			msg = "<center>" + drag.getPokemonName() + "  #" + drag.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", drag.getCharacteristics());
			request.setAttribute("type1",drag.getType());
			request.setAttribute("evolution1", drag.getEvolution());
			request.setAttribute("baseExp1", drag.getBaseExp());
		}
		if (value4 != null) {


            Mew mew=new Mew("Mew",151, "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.", "PSYCHIC",  "NONE" ,64);
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			  
			msg = "<center>" + mew.getPokemonName() + "  #" + mew.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", mew.getCharacteristics());
			request.setAttribute("type1",mew.getType());
			request.setAttribute("evolution1", mew.getEvolution());
			request.setAttribute("baseExp1", mew.getBaseExp());
		}

		if (value5 != null) {

            Pikachu piku=new Pikachu("Pikachu",25, "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot." ,"ELECTRIC" ,"RAICHU" ,112);
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			  
			msg = "<center>" + piku.getPokemonName() + "  #" + piku.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", piku.getCharacteristics());
			request.setAttribute("type1",piku.getType());
			request.setAttribute("evolution1", piku.getEvolution());
			request.setAttribute("baseExp1", piku.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
