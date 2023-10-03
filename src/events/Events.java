package events;

import java.time.LocalDate; 
import events.ExceptionDateTime;

public class Events {
    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private String theme;
    private String local;
    private String description;


    public Events(String name, LocalDate dateInit, LocalDate dateEnd, String theme, String local, String description) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        try {
            ExceptionDateTime validate = new ExceptionDateTime(description);
            validate.validateDate(dateEnd, dateInit);
        }catch(ExceptionDateTime e){
            System.out.println(e.getMessage());
        }
        this.theme = theme;
        this.local = local;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }



    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }



    public void setTheme(String theme) {
        this.theme = theme;
    }



    public void setLocal(String local) {
        this.local = local;
    }



    public void setDescription(String description) {
        this.description = description;
    }



    public String getName() {
        return name;
    }



    public LocalDate getDateInit() {
        return dateInit;
    }



    public LocalDate getDateEnd() {
        return dateEnd;
    }



    public String getTheme() {
        return theme;
    }



    public String getLocal() {
        return local;
    }



    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Events [name=" + name + ", LocalDateInit=" + dateInit + ", LocalDateEnd=" + dateEnd + ", theme=" + theme
                + ", local=" + local + ", description=" + description + "]";
    }


}