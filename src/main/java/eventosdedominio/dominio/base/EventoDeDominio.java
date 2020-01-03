package eventosdedominio.dominio.base;

import org.springframework.context.ApplicationEvent;

import java.time.LocalDate;

public abstract class EventoDeDominio extends ApplicationEvent {

    private LocalDate data;

    public EventoDeDominio(Object source, LocalDate data) {
        super(source);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }
}
