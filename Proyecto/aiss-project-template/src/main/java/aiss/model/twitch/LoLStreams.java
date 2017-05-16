
package aiss.model.twitch;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_total",
    "streams",
    "_links"
})
public class LoLStreams {

    @JsonProperty("_total")
    private Integer total;
    @JsonProperty("streams")
    private List<Stream> streams = null;
    @JsonProperty("_links")
    private Links__ links;

    @JsonProperty("_total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("_total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("streams")
    public List<Stream> getStreams() {
        return streams;
    }

    @JsonProperty("streams")
    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

    @JsonProperty("_links")
    public Links__ getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links__ links) {
        this.links = links;
    }

}
