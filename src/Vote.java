import java.util.Objects;

public class Vote {
    private Person Voter ;
    private String date ;

    public Vote(Person voter, String date) {
        Voter = voter;
        this.date = date;
    }

    public Person getVoter() {
        return Voter;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(Voter, vote.Voter) && Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Voter, date);
    }
}
