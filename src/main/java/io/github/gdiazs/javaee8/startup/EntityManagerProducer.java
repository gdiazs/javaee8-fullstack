package io.github.gdiazs.javaee8.startup;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Named
@Singleton
public class EntityManagerProducer {
    @PersistenceUnit(unitName = "javaee8Pu")
    private EntityManagerFactory emf;

    @Produces
    @RequestScoped
    public EntityManager create() {
        return emf.createEntityManager();
    }

    public void close(@Disposes EntityManager em) {
        if (em.isOpen()) {
            em.close();
        }
    }
}

