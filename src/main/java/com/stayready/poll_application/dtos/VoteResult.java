package com.stayready.poll_application.dtos;

import java.util.Collection;
public class VoteResult {
    private int totalVotes;
    private Collection<OptionCount> results;

    public int getTotalVotes() {
        return this.totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Collection<OptionCount> getResults() {
        return this.results;
    }

    public void setResults(Collection<OptionCount> results) {
        this.results = results;
    }
}