import java.util.List;

public interface Actor
    {
        void act(List<Actor> newActors);
        abstract public boolean isActive();
    }