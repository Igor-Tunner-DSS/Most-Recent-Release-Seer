package com.seer;

import com.seer.ReleaseDto;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GithubClient {
    public List<ReleaseDto> getReleases(String owner, String repo) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/repos/"+owner+"/"+repo+"/releases"))
                .GET()
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper(); 
        try {
            List<ReleaseDto> releases = mapper.readValue(response.body(), new TypeReference<List<>ReleaseDto>(){})
            System.out.println(releases.get(0).author());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}