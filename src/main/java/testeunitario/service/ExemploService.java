package testeunitario.service;

import org.springframework.stereotype.Service;

@Service
public class ExemploService {

    public int somaValores(int x, int y){
        return x + y;
    }
}
