//Devuelve todos tus IDs(summonerId, profileIconId, etc.)

package aiss.model.lol;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "profileIconId", "name", "summonerLevel", "accountId", "id", "revisionDate" })
public class LoLID {

	@JsonProperty("profileIconId")
	private Integer profileIconId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("summonerLevel")
	private Integer summonerLevel;
	@JsonProperty("accountId")
	private Integer accountId;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("revisionDate")
	private Long revisionDate;

	public LoLID() {

	}

	public LoLID(Integer profileIconId, String name, Integer summonerLevel, Integer accountId, Integer id,
			Long revisionDate) {
		this.profileIconId = profileIconId;
		this.name = name;
		this.summonerLevel = summonerLevel;
		this.accountId = accountId;
		this.id = id;
		this.revisionDate = revisionDate;
	}

	@JsonProperty("profileIconId")
	public Integer getProfileIconId() {
		return profileIconId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("summonerLevel")
	public Integer getSummonerLevel() {
		return summonerLevel;
	}

	@JsonProperty("accountId")
	public Integer getAccountId() {
		return accountId;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("revisionDate")
	public Long getRevisionDate() {
		return revisionDate;
	}
}