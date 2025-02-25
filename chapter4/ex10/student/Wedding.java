import java.time.LocalDate;

public class Wedding{
    private Couple couple;
    private LocalDate weddingDate;
    private String location;


public Wedding(){
    this.couple = new Couple();
    this.weddingDate = LocalDate.now();
    this.location = "";
}
public Wedding(Couple couple, LocalDate weddingDate, String location){
    this.couple = couple;
    this.weddingDate = weddingDate;
    this.location = location;
}
    public Couple getCouple(){
        return couple;
    }
    public LocalDate getWeddingDate(){
        return weddingDate;
    }
    public String getlocation(){
        return location;
    }
}