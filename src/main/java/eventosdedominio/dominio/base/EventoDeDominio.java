package eventosdedominio.dominio.base;

import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;

public abstract class EventoDeDominio extends ApplicationEvent {

    private LocalDateTime data;

    public EventoDeDominio(Object source, LocalDateTime data) {
        super(source);
        this.data = data;
    }

    public LocalDateTime getData() {
        return data;
    }
}
