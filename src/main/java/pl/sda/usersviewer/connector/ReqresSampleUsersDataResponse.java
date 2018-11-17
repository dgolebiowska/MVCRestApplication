package pl.sda.usersviewer.connector;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ReqresSampleUsersDataResponse {
    private int page;

    @JsonProperty("per_page")
    private Integer perPage;

    private Integer total;

    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("data")
    private List<User> users;

}
