package Models.TTN;

import java.util.Date;

public class TTN {

    private Company sender;
    private Company receiver;
    private Date date;

    public TTN(Company sender, Company receiver, Date date){
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
    }

    public Company getSender() {
        return sender;
    }

    public void setSender(Company sender) {
        this.sender = sender;
    }

    public Company getReceiver() {
        return receiver;
    }

    public void setReceiver(Company receiver) {
        this.receiver = receiver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
