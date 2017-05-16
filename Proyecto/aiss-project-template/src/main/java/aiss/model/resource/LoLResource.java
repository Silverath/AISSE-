package aiss.model.resource;

import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.lol.LoLID;
import aiss.model.lol.champion.ChampionID;

public class LoLResource {
	private final String uriSummoner = "https://euw1.api.riotgames.com/lol/summoner/v3/summoners/by-name";
	private final String uriChampion = "https://euw1.api.riotgames.com/lol/platform/v3/champions";
	private final String apiKey = "?api_key=RGAPI-50d7cb0c-1a86-43b1-bc0c-c7c55f5eb730";
	private static final Logger log = Logger.getLogger(LoLResource.class.getName());

	public LoLID getSummoner(String summonerName) {
		ClientResource cr = null;
		LoLID id = null;

		try {
			cr = new ClientResource(uriSummoner + "/" + summonerName + apiKey);
			id = cr.get(LoLID.class);
		} catch (ResourceException re) {
			System.err.println("Status code: " + cr.getResponse().getStatus());
		}

		return id;
	}

	public ChampionID getChampionName(Integer championId) {
		ClientResource cr = null;
		ChampionID id = null;

		try {
			cr = new ClientResource(uriChampion + "/" + championId + apiKey);
			id = cr.get(ChampionID.class);
		} catch (ResourceException re) {
			System.err.println("Error: " + re.getResponse().getStatus());
		}
		return id;
	}
}