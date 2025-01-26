package org.batch.gofdesignpatter.creational.singletondesignpattern;

public class EntityManager {

    private static EntityManager entityManager;

    private EntityManager() {
    }

    public static EntityManager getInstance(){

        if(entityManager != null){
            return entityManager;
        }

        //thread-0  , thread-1
        synchronized (EntityManager.class) {
            if (entityManager == null) {    // thread-1
                entityManager = new EntityManager();  //thread-0 (EM1-10)
            }
        } //thread-0 release lock


        return entityManager;
    }
}


/*





 */