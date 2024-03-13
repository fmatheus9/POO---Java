//MAIN 
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger(123,"Matheus","470.944.208-89");
        Flight f1 = new Flight(1001,"Franca", "São Paulo");
        Reservation r1 = new Reservation(12345,new Date(),p1,f1);
        System.out.println(r1.toString());
    }
}

//CLASSE PASSENGER
//A CLASSE 'PASSENGER' E A CLASSE 'RESERVATION' FORMAM UMA ASSOCIAÇÃO
//PASSENGER É PARTE E RESERVATION TODO
public class Passenger {
    private Number id;
    private String name;
    private String cpf;

    public Passenger() {
    }

    public Passenger(int id, String name, String cpf) {
        this.setId(id);
        this.setName(name);
        this.setCpf(cpf);
    }

    public Number getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

//CLASSE RESERVATION
import java.util.Date;

//A CLASSE 'PASSENGER' E A CLASSE 'RESERVATION' FORMAM UMA ASSOCIAÇÃO
//PASSENGER É PARTE E RESERVATION TODO
//A CLASSE 'FLIGHT' E A CLASSE 'RESERVATION' FORMAM UMA ASSOCIAÇÃO
//FLIGHT É PARTE E RESERVATION TODO
public class Reservation {
    private int id;
    private Date date;
    Passenger passenger;
    Flight flight;

    public Reservation() {
    }

    public Reservation(int id, Date date, Passenger passenger, Flight flight) {
        this.setId(id);
        this.setDate(date);
        this.setPassenger(passenger);
        this.setFlight(flight);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", passenger=" + passenger +
                ", flight=" + flight +
                '}';
    }
}

//CLASSE FLIGHT
//A CLASSE 'FLIGHT' E A CLASSE 'RESERVATION' FORMAM UMA ASSOCIAÇÃO
//FLIGHT É PARTE E RESERVATION TODO
public class Flight {
    private Number id;
    private String origin;
    private String destination;

    public Flight() {
    }

    public Flight(int id, String origin, String destination) {
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
    }

    public Number getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
