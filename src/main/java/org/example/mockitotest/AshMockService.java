package org.example.mockitotest;

public class AshMockService {

    public AshMockRepository repository;


    public AshMockService(AshMockRepository repository) {
        this.repository = repository;
    }

    public String getData(String k) {
        return repository.getData(k);
    }


}
