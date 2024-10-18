package org.howard.edu.lsp.midterm.question3;

import java.util.LinkedHashMap;
import java.util.Map;

public class VotingMachine {
	// Stores candidate names and their votes
    private Map<String, Integer> candidates = new LinkedHashMap<>();

    // Adds candidate to the list
    public void addCandidate(String name) {
        candidates.put(name, 0);  // votes are 0 at default
    }

    // Casts vote for a candidate
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate not found.");
        }
    }

    // toString
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
    
}

//https://www.w3schools.com/java/java_hashmap.asp
