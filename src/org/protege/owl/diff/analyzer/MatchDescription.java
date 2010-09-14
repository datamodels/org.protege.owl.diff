package org.protege.owl.diff.analyzer;

public class MatchDescription implements Comparable<MatchDescription> {
    public static int MAX_SEQUENCE = 10;
    public static int DEFAULT_SEQUENCE = 5;
    public static int MIN_SEQUENCE = 0;
    
    private String description;
    private int sequence;
    
    public MatchDescription(String description) {
        this(description, DEFAULT_SEQUENCE);
    }
    
    public MatchDescription(String description, int sequence) {
        super();
        this.description = description;
        this.sequence = sequence;
    }

    public String getDescription() {
        return description;
    }
    
    public int compareTo(MatchDescription o) {
        if (sequence < o.sequence) {
            return -1;
        }
        else if (sequence > o.sequence) {
            return +1;
        }
        else {
            return description.compareTo(o.description);
        }
    }

}