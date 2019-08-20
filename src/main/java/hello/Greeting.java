package hello;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting extends ResourceSupport {

    private final long id;
    private final String content;

    @JsonCreator
    public Greeting(@JsonProperty("content") String content) {
        this.id = 1;
        this.content = content;
    }

    @JsonCreator
    public Greeting(
        @JsonProperty("id") long id,
        @JsonProperty("content") String content) {
        this.id = id;
        this.content = content;
    }

    public long getGreetingId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
