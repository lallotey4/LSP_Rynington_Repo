package org.howard.edu.lsp.midterm.question3;
import java.util.HashMap;
import java.util.Map;

/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc. 
 * The VotingMachine class represents a simplified electronic voting machine.
 * It maintains a list of candidates and their respective vote counts.
 * New line to help commit
 */
public class VotingMachine {
    private Map<String, Integer> candidates;

    /**
     * Constructor for VotingMachine class.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate with the given name to the list.
     * 
     * @param name the name of the candidate to add
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // Initialize votes to 0 for the new candidate
        }
    }

    /**
     * Casts a vote for the candidate with the given name.
     * 
     * @param name the name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); // Increment the vote count
        }
    }

    /**
     * Returns a string representation of the candidates and their votes.
     * 
     * @return a formatted string of candidates and their vote counts
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}
